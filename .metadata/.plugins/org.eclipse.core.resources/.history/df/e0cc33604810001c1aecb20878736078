package com.revature;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
	
		
//		int id = Integer.parseInt(request.getParameter("id"));
		
		Employee employee = new Employee();
		
		
		try {
			EmployeeDao dao = EmployeeDAOFactory.getEmployeeDao();
			dao.deleteEmployee(employee);
			System.out.println("employee record deleted successfully");
		} catch (SQLException e) {
			System.out.println("something went wrong1");
			e.printStackTrace();
		}catch (ClassNotFoundException e1) {
			System.out.println("something went wrong2");
			e1.printStackTrace();
		}	
	}
		
	}
