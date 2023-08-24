package com.rk.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="person_table")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="first_name", length=60 , nullable = false)
	private String firstName;
	
	@Column(name="last_name", length=60 , nullable = false)
	private String LastName;

	private String email;
	
	@Column(name="creation_date")
	private Date creationDate;
	
	public Person(String firstName, String LastName , String email, Date creationDate) {
		super();
		this.firstName = firstName;
		this.LastName= LastName;
		this.email = email;
		this.creationDate = creationDate;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
	public void setCreationDate(Date creationdate) {
		this.creationDate = creationdate;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastName() {
		return LastName;
		
	}
	public void setLastName(String lastName) {
		this.LastName =lastName;
	}
		
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", email=" + email
				+ ", creationDate=" + creationDate + "]";
	}
	
	

}
