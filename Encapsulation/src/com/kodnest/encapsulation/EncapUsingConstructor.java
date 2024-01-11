package com.kodnest.encapsulation;

public class EncapUsingConstructor {
	
	int a;
	
	
	void print()
	{
		System.out.println("hi this is Encap using constructor");
	}
	
	public EncapUsingConstructor(int a)
	{
		if(a>0)
			this.a=a;
		else
		{
			System.out.println("enter a positive number");
		}
	}

}
