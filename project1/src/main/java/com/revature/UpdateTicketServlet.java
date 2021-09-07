package com.revature;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateTicketServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// get ticket values
		int ticketId = Integer.parseInt(request.getParameter("ticket_id").trim());
		int userId = Integer.parseInt(request.getParameter("user_id"));
		String status = request.getParameter("ticket_status");
		String type = request.getParameter("ticket_type");
		double amt = Double.parseDouble(request.getParameter("reimbursement_amount"));
		String desc = request.getParameter("ticket_description");

		// get the ticket by Id
		//Ticket ticket = session.get(Ticket.class, ticketId);
		Ticket ticket = new Ticket();

		// create new ticket values with values from request
		ticket.setUserId(userId);
		ticket.setStatus(status);
		ticket.setType(type);
		ticket.setDescription(desc);
		ticket.setReimbursementAmount(amt);
		ticket.setTimestamp(new Date());

		try {
			ITicketDAO dao = TicketDAOFactory.getTicketDao();
			dao.updateTicket(ticket);
			System.out.println("Ticket updated!");
		} catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}


		// send empty response
		//response.sendRedirect("");
	}
}
