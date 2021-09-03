package revature.servlets;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import revature.HibernateSessionFactory;
import revature.Ticket;

public class UpdateTicketServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			// get ticket values
			int ticketId = Integer.parseInt(request.getParameter("ticket_id").trim());
			int userId = Integer.parseInt(request.getParameter("user_id"));
			String type = request.getParameter("ticket_type");
			double amt = Double.parseDouble(request.getParameter("reimbursement_amount"));
			String desc = request.getParameter("ticket_description");
			
			//FIXME: change to type Date and parse? or don't need variable?
			String dateCreated = request.getParameter("timestamp");
			
			//FIXME: move session and transactions to TicketDAOImpl
			// open a session
			Session session = HibernateSessionFactory.getFactory().openSession();
			
			// being a transaction 
			Transaction transaction = session.beginTransaction();
			
			// get the ticket by Id
			Ticket ticket = session.get(Ticket.class, ticketId);
			
			// update ticket values with values from request
			ticket.setUserId(userId);
			ticket.setType(type);
			ticket.setDescription(desc);
			ticket.setReimbursementAmount(amt);
			ticket.setTimestamp(new Date());
			
			// update the table and close the session
			session.update(ticket);
			transaction.commit();
			session.close();
			
			// send empty response
			response.sendRedirect("");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
