package com.kodnest.hibernate3.FriendsAndJobs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Friends {
	
	@Id
	int roll;
	String name;
	int age;
	@OneToOne
	Jobs j;
	
	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friends(int roll, String name, int age, Jobs j) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.j = j;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Jobs getJ() {
		return j;
	}

	public void setJ(Jobs j) {
		this.j = j;
	}

	@Override
	public String toString() {
		return "Friends [roll=" + roll + ", name=" + name + ", age=" + age + ", j=" + j + "]";
	}
	
	
	

}
