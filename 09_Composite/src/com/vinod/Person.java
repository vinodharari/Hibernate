package com.vinod;

public class Person {
	private PersonPK personPk;
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
