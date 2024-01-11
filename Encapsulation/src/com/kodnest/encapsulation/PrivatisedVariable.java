package com.kodnest.encapsulation;

public class PrivatisedVariable {
	
	private int age;
	
	public void setAge(int age)
	{
		if(age>0)
		this.age=age;
		
		else
		{
			System.out.println("enter a positive value");
			
		}
	}
	
	public int getAge()
	{
		return age;
	}

}
