package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Laptop;
import com.Entity.Student;

public class mainclass {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss =  sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Laptop l = new Laptop();
		l.setLid(202);
		l.setBrand("HP");
		ss.persist(l);
		
		Student s = new Student();
		s.setSid(1);
		s.setSname("SURAJ");
		s.setLaptop(l);
		
		ss.persist(s);
		
		System.out.println("Data is inserted succesfully!!!");
		
		tr.commit();
		ss.close();
		
	}

}
