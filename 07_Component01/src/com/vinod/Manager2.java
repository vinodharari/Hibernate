package com.vinod;

import org.hibernate.Session;

public class Manager2 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		
		Company c = (Company) s1.load(Company.class, "102");
		System.out.println(c.getCompanyId());
		System.out.println(c.getCompanyHouseNo());
		System.out.println(c.getCompanyName());
		System.out.println(c.getcStreetName());
		System.out.println("===========Person===========");
		Project p1 = c.getProject();
		System.out.println(p1.getCustomerName());
		System.out.println(p1.getDuration());
		System.out.println(p1.getTitle());
		System.out.println("==========Employee===========");
		Employee e1=p1.getEmployee();
		System.out.println(e1.getFirstName());
		System.out.println(e1.getLastName());
		System.out.println("==========Address============");
		Address a1=e1.getAddress();
		System.out.println(a1.getCity());
		System.out.println(a1.getHouseNo());
		System.out.println(a1.getState());
		System.out.println(a1.getStreetName());
		System.out.println("=========Education============");
		Education d1=e1.getEducation();
		System.out.println(d1.getName());
		System.out.println(d1.getYearOfPassOut());
		/*Person p1=(Person)s1.load(Person.class, "102");
		System.out.println(p1.getAge());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getPersonId());
		Address a1=p1.getAddress();
		System.out.println(a1.getCity());
		System.out.println(a1.getHouseNo());
		System.out.println(a1.getState());
		System.out.println(a1.getStreetName());*/
	}
}
