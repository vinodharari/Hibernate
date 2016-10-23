package com.vinod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="xxx")
@NamedNativeQueries({
	@NamedNativeQuery(name="q1", query="select * from xxx"),
	@NamedNativeQuery(name="q2", query="select * from xxx where age<31"),
	@NamedNativeQuery(name="q3", query="select * from xxx where age<?"),
	@NamedNativeQuery(name="q4", query="select * from xxx where age<:abc"),
	@NamedNativeQuery(name="q5", query="select * from xxx", resultClass=Person.class)
}) 
public class Person {
	@Id
	private int personId;
	@Column(name="first_name")
	private String firstName;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
