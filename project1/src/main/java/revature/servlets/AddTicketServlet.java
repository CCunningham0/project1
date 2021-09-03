package revature.servlets;

import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import revature.HibernateSessionFactory;
import revature.Ticket;

public class AddTicketServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {

			//FIXME: pass in user id (from session management?)
			//int userId = Integer.parseInt(request.getParameter("user_id"));

			double amt = Double.parseDouble(request.getParameter("reimbursement_amount"));
			String desc = request.getParameter("ticket_description");
						
			// open a session
			Session session = HibernateSessionFactory.getFactory().openSession();
			
			// being a transaction 
			Transaction transaction = session.beginTransaction();
			
			// create a new ticket
			Ticket ticket = new Ticket();
			// update ticket values with values from request
			ticket.setUserId(1);
			ticket.setType("pending");
			ticket.setDescription(desc);
			ticket.setReimbursementAmount(amt);
			ticket.setTimestamp(new Date());
			
			// save the ticket in the table and close the session
			session.save(ticket);
			transaction.commit();
			session.close();
			
			// send empty response
			response.sendRedirect("");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
