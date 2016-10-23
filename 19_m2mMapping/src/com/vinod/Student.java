package com.vinod;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student19")
public class Student {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	@ManyToMany(cascade={CascadeType.ALL})
	@JoinTable(name="B_S", joinColumns={@JoinColumn(name="S_ID")},inverseJoinColumns={@JoinColumn(name="B_ID")})
	private Set<Batch> batches=new HashSet<Batch>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<Batch> getBatches() {
		return batches;
	}
	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
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
