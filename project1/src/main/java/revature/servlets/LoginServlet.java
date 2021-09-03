package revature.servlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import revature.HibernateSessionFactory;


public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			int noteId = Integer.parseInt(request.getParameter("noteId").trim());
			
			Session session = HibernateSessionFactory.getFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
