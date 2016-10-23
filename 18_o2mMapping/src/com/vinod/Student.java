package com.vinod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="Student18_o2m")
public class Student {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	@OneToMany
	@JoinColumn(name="student_id")
	@IndexColumn(name="sno")
	private Mail[] mails;
	
	public Mail[] getMails() {
		return mails;
	}
	public void setMails(Mail[] mails) {
		this.mails = mails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
