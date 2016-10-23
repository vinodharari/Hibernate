package com.vinod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;

public class Manager10 {
	public static void main(String[] args){
		Session s1=Util.getSession();
		FileReader fin=null;
		BufferedReader bin=null;
		try{
			fin=new FileReader("Data.txt");
			bin=new BufferedReader(fin);
			String row=bin.readLine();
			System.out.println(row);
			Order order=null;
			s1.beginTransaction();
			String[] rowData;
			while(row!=null){
				rowData=row.split(",");
				System.out.println(rowData[0]+rowData[1]);
				order=new Order();
				order.setOrderId(rowData[0]);
				System.out.println(rowData[1]);
				order.setCustomerName(rowData[1].trim());
				order.setQuantity(Integer.parseInt(rowData[2].trim()));
				order.setPrice(Integer.parseInt(rowData[3].trim()));
				s1.save(order);
				row=bin.readLine();
			}
			s1.getTransaction().commit();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		finally{
		}
		System.out.println("done");
	}
}
