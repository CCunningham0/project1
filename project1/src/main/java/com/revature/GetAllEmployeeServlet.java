

package com.revature;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/getAllEmployee")
public class GetAllEmployeeServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
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
			dao.getAllEmployee();
			System.out.println("list of all employees");
		} catch (SQLException e) {
			System.out.println("something went wrong1");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

