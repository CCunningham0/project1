package com.revature;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		
		Employee employee = new Employee();
		
		employee.setName(name);
		employee.setEmail(email);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setType(type);

		
		try {
			EmployeeDao dao = EmployeeDAOFactory.getEmployeeDao();
			dao.updateEmployee(employee);
			System.out.println("employee record updated successfully");
		} catch (SQLException e) {
			System.out.println("something went wrong1");
			e.printStackTrace();
		}catch (ClassNotFoundException e1) {
			System.out.println("something went wrong2");
			e1.printStackTrace();
		}	
	}
}
