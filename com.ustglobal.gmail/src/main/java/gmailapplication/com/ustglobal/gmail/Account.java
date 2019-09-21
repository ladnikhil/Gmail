package gmailapplication.com.ustglobal.gmail;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
	@Id
	@Column
	private int User_Id;
	@Column
	private String User_Name;
	@Column
	private String Password;
	@Column
	private String Email;
	
	
	public int getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name =" Message_Id")
	private Inbox inb;


	public Inbox getInb() {
		return inb;
	}
	public void setInb(Inbox inb) {
		this.inb = inb;
	}
	
	
	
	
	
	
	

}
