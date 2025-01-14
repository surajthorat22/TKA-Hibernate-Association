package com.Main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Department;
import com.Entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setEname("Suraj");
		ss.persist(e1);
		
		Employee e2 = new Employee();
		e2.setEid(2);
		e2.setEname("Vedant");
		ss.persist(e2);

		Department d = new Department();
		d.setdid(101);
		d.setdname("Java Devoloper");
	    e1.setDept(d);
	    e2.setDept(d);
	    
	    List<Employee> list = new ArrayList<Employee>();
	    list.add(e1);
	    list.add(e2);
	    
	    d.setEmp(list);
	    ss.persist(d);
	    
	    
	    System.out.println("The Mapping  Data Sucessfully!!");
	    tr.commit();
	    ss.close();
		
	}
	
}
