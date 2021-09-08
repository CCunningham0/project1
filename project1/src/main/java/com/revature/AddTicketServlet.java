package com.revature;

import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddTicketServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");

		// TODO: use this once user_id available
		//int userId = Integer.parseInt(request.getParameter("user_id"));
		double amt = Double.parseDouble(request.getParameter("reimbursement_amount"));
		String desc = request.getParameter("ticket_description");
		String type = request.getParameter("ticket_type");

		// create a new ticket
		Ticket ticket = new Ticket();

		// update ticket values with values from request
		ticket.setUserId(1);
		ticket.setStatus("pending");
		ticket.setType(type);
		ticket.setDescription(desc);
		ticket.setReimbursementAmount(amt);
		ticket.setTimestamp(new Date());

		try {
			ITicketDAO dao = TicketDAOFactory.getTicketDao();
			dao.addTicket(ticket);
			response.sendRedirect("ticketList.jsp");
			System.out.println("Ticket updated!");
		} catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}

	}
}
