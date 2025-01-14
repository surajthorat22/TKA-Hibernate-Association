package com.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	
		@Id
		private int did;
		private String dname;
		
		@OneToMany(mappedBy = "dept")
		private List<Employee> emp;

		public int getdid() {
			return did;
		}

		public void setdid(int did) {
			this.did = did;
		}

		public String getdname() {
			return dname;
		}

		public void setdname(String dname) {
			this.dname = dname;
		}

		
		public List<Employee> getEmp() {
			return emp;
		}

		public void setEmp(List<Employee> emp) {
			this.emp = emp;
		}

		public Department(int did, String dname, Employee emp) {
			super();
			this.did = did;
			this.dname = dname;
			this.emp = (List<Employee>) emp;
		}

		public Department() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Department [did=" + did + ", dname=" + dname + ", emp=" + emp + "]";
		}
		
		
		
		
	}


