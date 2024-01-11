package com.kodnest.encapsulation;

public class EncapsulationClass01 {
	
	int i;
	String s;
	
	void print()
	{
		System.out.println("hello its print method");
	}
	
	public EncapsulationClass01(int i, String s)
	{
		if(i>0)
		this.i=i;
		
		else {
			System.out.println("enter a positive number");
			return;
		}
		this.s=s;
		
	}

}
