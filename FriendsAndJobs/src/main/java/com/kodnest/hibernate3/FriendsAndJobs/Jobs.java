package com.kodnest.hibernate3.FriendsAndJobs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Jobs {
	
	@Id
	int id;
	String company;
	int salary;
	@OneToOne
	Friends f;
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jobs(int id, String company, int salary, Friends f) {
		super();
		this.id = id;
		this.company = company;
		this.salary = salary;
		this.f = f;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Friends getF() {
		return f;
	}
	public void setF(Friends f) {
		this.f = f;
	}
	@Override
	public String toString() {
		return "Jobs [id=" + id + ", company=" + company + ", salary=" + salary + ", f=" + f + "]";
	}
	
	

}
