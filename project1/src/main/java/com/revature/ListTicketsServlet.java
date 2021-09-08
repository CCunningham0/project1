package com.revature;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListTicketsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		try {
			if (action == "getTickets") {
				getAllTickets(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void getAllTickets(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			List<Ticket> tickets = null;
			ITicketDAO dao = TicketDAOFactory.getTicketDao();
			tickets = dao.getTickets();
			
			String jsonStr = new Gson().toJson(tickets);
			PrintWriter out = response.getWriter();
			
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			out.print(jsonStr);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<Ticket> tickets = null;
		StringBuilder strBuild = new StringBuilder();
		strBuild.append(
				"<html>"
				+ "<head>"
				+ "<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />"		
				+ "<style>"
				+ "body {"
				+ "margin-left: 5%;"
				+ "margin-right: 5%;"
				+ "}"
				+ "</style>"
				+ "</head>"
				+ "<body>"
	
				+ "<table class=\"table table-dark\">"
				+ "<thead>"
				+ "<tr>"
				+ "<th scope=\"col\">ID</th>"
				+ "<th scope=\"col\">User ID</th>"
				+ "<th scope=\"col\">Type</th>"
				+ "<th scope=\"col\">Amount</th>"
				+ "<th scope=\"col\">Status</th>"
				+ "<th scope=\"col\">Description</th>"
				+ "<th scope=\"col\">Date</th>"
				+ "</tr>"
				+ "</thead>"
				+ "<tbody>");

		
		try {
			ITicketDAO dao = TicketDAOFactory.getTicketDao();
			tickets = dao.getTickets();
			System.out.println("Tickets found!");
		} catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}

		for (Ticket ticket : tickets) {
			strBuild.append("<tr><td>")
			.append(ticket.getId())
			.append("</td><td>")
			.append(ticket.getUserId())
			.append("</td><td>")
			.append(ticket.getType())
			.append("</td><td>")
			.append(ticket.getReimbursementAmount())
			.append("</td><td>")
			.append(ticket.getStatus())
			.append("</td><td>")
			.append(ticket.getDescription())
			.append("</td><td>")
			.append(ticket.getTimestamp())
			.append("</td><td>");




		}
		strBuild.append(
				"</tbody>"
				+ "</table>"
				+ "</body>"
				+ "</html>");
		out.println(strBuild.toString());



		// send empty response
		//response.sendRedirect("");
	}
	
	
	
}
