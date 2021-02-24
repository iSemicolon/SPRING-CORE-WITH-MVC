package org.kol.ServletHibernateApp.Dto;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Employee_Details")
public class Employee {
	
	@Id
	@GeneratedValue(generator = "mygen")
	@GenericGenerator(name="mygen", strategy="increment")
	private int id;
	private String emp_Id;
	private String firstname;
	private String lastname;
	
	@Column(unique =true)
	private String emailId;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(String emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_Id=" + emp_Id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", emailId=" + emailId + ", password=" + password + "]";
	}
	 
	
	
	
	
	
	
}
