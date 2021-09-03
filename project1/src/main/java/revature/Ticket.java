package revature;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tickets_table")
public class Ticket {
	@Id //field behaves as primary key in table
	@GeneratedValue //defaults to auto
	private int id; // identifier property
	
	private int userId; //foreign key in user/employee table
	

	@Column(name = "ticket_type", nullable = false)
	private String type;
	
	@Column(name = "reimbursement_amount")
	private double reimbursementAmount;
	
	@Column(name = "ticket_description")
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;
	
	public Ticket () {};
	
	public Ticket (int id, int userId, String type, 
			double reimbursementAmount, String description, Date timestamp) {
		this.id = id;
		this.userId = userId;
		this.type = type;
		this.reimbursementAmount = reimbursementAmount;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getReimbursementAmount() {
		return reimbursementAmount;
	}

	public void setReimbursementAmount(double reimbursementAmount) {
		this.reimbursementAmount = reimbursementAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
