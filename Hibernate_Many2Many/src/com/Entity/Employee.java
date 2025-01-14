package com.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int eid;
	private String ename;
	
	@ManyToMany
	@JoinTable(
	        name = "employee_department", 
	        joinColumns = @JoinColumn(name = "emp_eid"), 
	        inverseJoinColumns = @JoinColumn(name = "dept_did")
	    )
	private List<Department> dept;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<Department> getDept() {
		return dept;
	}


	public Employee(int eid, String ename, List<Department> dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Dept=" + dept + "]";
	}

	public void setDept(List<Department> dlist) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
