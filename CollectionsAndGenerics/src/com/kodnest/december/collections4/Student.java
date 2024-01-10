package com.kodnest.december.collections4;


public class Student{			//suppose this class is not available to us for modifications. we have to make a separate class
	
	int roll;
	String name;
	float per;
	
	public Student(int roll,String name,float per)
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
	
	@Override
	public String toString()
	{
		return roll+" "+name+" "+per;
	}
}
