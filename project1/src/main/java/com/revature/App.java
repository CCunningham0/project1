package com.revature;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main( String[] args )
    {
        System.out.println( "project started" );
  
        
//        
//       // create a configuration object
//        Configuration cfg = new Configuration();
//        // read the configuration and load in the object
//        cfg.configure("hibernate.cfg.xml");
//        // create factory
//        SessionFactory factory = cfg.buildSessionFactory();
//        // open the session
//        Session session = factory.openSession();
//        // begin the transaction
//        Transaction t = session.beginTransaction();
          
        
//       // create employee
//        Employee employee =new Employee();
//        employee.setId(3);
//        employee.setName("Meysam");
//        employee.setEmail("l@gmail.com");
//        employee.setUsername("lily123");
//        employee.setPassword("123");
//        EmployeeDao eDao = new EmployeeDaoImpl();
//        
//        
//        try {
// //       	eDao.updateEmployee(employee);
////			eDao.addEmployee(employee);
//        	List<Employee> emp = eDao.getAllEmployee();
//        	System.out.println(emp);
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
        
        // save the employee
//        session.save(employee);
//        
        // commit the transaction
    }
}

