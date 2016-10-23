package com.vinod;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="person10")
@NamedNativeQueries({
	@NamedNativeQuery(name="q1", query="select * from person10"),
	@NamedNativeQuery(name="q2", query="select * from person10 where age>24")
})
public class Person {
	@EmbeddedId
	private PersonPK personPk;
	@Column(name="last_name")
	private String lastName;
	private int age;
	private String address;
	public PersonPK getPersonPk() {
		return personPk;
	}
	public void setPersonPk(PersonPK personPk) {
		this.personPk = personPk;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
