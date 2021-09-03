package revature;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TicketDAOImpl implements ITicketDAO {
	private static Statement statement = null;
	private static PreparedStatement preparedStatement = null;
	
	Session session = null;
	Transaction transaction = null;
	
	public TicketDAOImpl() {
		this.session = HibernateSessionFactory.getFactory().openSession();
	}
	
	public void addTicket(Ticket ticket) {
		transaction = session.beginTransaction();
		//Add new Employee object
		Ticket tik = new Ticket();
		tik.setType("rejected");
		tik.setUserId(1);
		tik.setDescription("addTicket test 2");

		//Save the employee in database
		session.save(tik);

		//Commit the transaction
		transaction.commit();
		session.close();
		
	}

	public void updateTicket(Ticket ticket) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteTicket(Ticket ticket) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public List<Ticket> getTickets() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
