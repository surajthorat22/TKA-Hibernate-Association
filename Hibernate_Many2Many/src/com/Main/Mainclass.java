package com.Main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Department;
import com.Entity.Employee;

public class Mainclass {

	public static void main(String[] args) throws Exception {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Department d = new Department();
		d.setDid(101);
		d.setDname("DevOps");
		
		Department d1 = new Department();
		d1.setDid(102);
		d1.setDname("FS Java");
		
		Employee e = new Employee();
		e.setEid(1);
		e.setEname("Kartiki");

		List<Department> dlist = new ArrayList<>();
		dlist.add(d);
		dlist.add(d1);
		e.setDept(dlist);
		
		List<Employee> elist = new ArrayList<>();
		elist.add(e);
		d.setEmp(elist);
		
		ss.persist(d);
		ss.persist(d1);
		ss.persist(e);
		
		tr.commit();
		ss.close();
		
		System.out.println("Data Saved succesfully!!!");


	}

}
