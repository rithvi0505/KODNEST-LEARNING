package com.kodnest.hibernate6.StudentAndLaptops.StudentAndLaptops;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	int laptopId;
	String laptopBrand;
	int laptopCost;
	
	@ManyToOne
	Student student;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int laptopId, String laptopBrand, int laptopCost, Student student) {
		super();
		this.laptopId = laptopId;
		this.laptopBrand = laptopBrand;
		this.laptopCost = laptopCost;
		this.student = student;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	public int getLaptopCost() {
		return laptopCost;
	}

	public void setLaptopCost(int laptopCost) {
		this.laptopCost = laptopCost;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopBrand=" + laptopBrand + ", laptopCost=" + laptopCost
				+ ", student=" + student + "]";
	}
	
	
	
	

}
