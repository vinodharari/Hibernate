package com.vinod;

public class Person {
	private int id;
	private String firstName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setId : "+id);
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
