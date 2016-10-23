package com.vinod;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Util {
	private static SessionFactory sf;
	static
	{
		Configuration c1=new Configuration().configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(c1.getProperties()).buildServiceRegistry();
		sf=c1.buildSessionFactory(sr);
	}
	
	public static Session getSession()
	{
		return sf.openSession();
	}
}
