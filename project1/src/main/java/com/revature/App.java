package com.revature;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main( String[] args )
	{
		System.out.println("Project started...");
		/*
//		// create a configuration object
		Configuration cfg = new Configuration();

		// read the configuration and load in the object
		cfg.configure("hibernate.cfg.xml");

//		// create factory
		SessionFactory factory = cfg.buildSessionFactory();
//		
//		// open the session
		Session session = factory.openSession();
		// begin the transaction
		Transaction t = session.beginTransaction();

		
		
		ITicketDAO ticketDao = new TicketDAOImpl();
		
		
		//create ticket
		Ticket ticket = new Ticket();
		ticket.setUserId(1);
		ticket.setStatus("pending");
		ticket.setType("accepted"); //pending/approved/rejected
		ticket.setReimbursementAmount(10);
		ticket.setDescription("placeholder description");
		ticket.setTimestamp(new Date());

		// save the ticket
		session.save(ticket);
//
		// commit the transaction/		
		t.commit();
		// close the session
		
//        Query query = session.createQuery("from EMPLOYEE");
//        java.util.List list = query.list();
//        System.out.println(list);
		
		session.close();
		*/
	}
}

