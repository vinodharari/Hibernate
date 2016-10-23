package com.vinod;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="batch19")
public class Batch {
	@Id
	private int id;
	private String title;
	@ManyToMany(mappedBy="batches")
	private Set<Student> students=new HashSet<Student>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student std){
		students.add(std);
		std.getBatches().add(this);
	}
	
}
