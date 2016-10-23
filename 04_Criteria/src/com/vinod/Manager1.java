package com.vinod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;

public class Manager1 {
	public static void main(String[] args){
		Session s1=Util.getSession();
		FileReader fin=null;
		BufferedReader bin=null;
		try{
			fin=new FileReader("Person.txt");
			bin=new BufferedReader(fin);
			String row=bin.readLine();
			Person p1=null;
			s1.beginTransaction();
			String[] data=null;
			while(row!=null){
				data=row.split(",");
				p1=new Person();
				p1.setId(Integer.parseInt(data[0].trim()));
				p1.setFirstName(data[1].trim());
				p1.setAddress(data[2].trim());
				p1.setEducation(data[3].trim());
				p1.setAge(Integer.parseInt(data[4].trim()));
				p1.setSalary(Integer.parseInt(data[5].trim()));
				s1.save(p1);
				row=bin.readLine();
			}
			s1.getTransaction().commit();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		finally{
		}
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
