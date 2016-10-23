package com.vinod;

import org.hibernate.Session;

public class Manager1 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Address add1=new Address();
		add1.setHouseNo("123/M");
		add1.setStreetName("BTM");
		add1.setCity("Blr");
		add1.setState("kar");
		
		Education educ=new Education();
		educ.setName("BE");
		educ.setYearOfPassOut(2015);
		
		Employee emp=new Employee();
		emp.setFirstName("vinod");
		emp.setLastName("jain");
		emp.setAddress(add1);
		emp.setEducation(educ);
		
		Project p1=new Project();
		p1.setCustomerName("city");
		p1.setTitle("hero");
		p1.setDuration(120);
		p1.setEmployee(emp);
		
		Company c1=new Company();
		c1.setCompanyHouseNo("c101");
		c1.setCompanyId("102");
		c1.setCompanyName("abc");
		c1.setcStreetName("sf");
		c1.setProject(p1);
		
		s1.beginTransaction();
		s1.save(c1);
		s1.getTransaction().commit();
		
		System.out.println("done");
	}
}
