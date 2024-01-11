package com.kodnest.inheritance.methodoverriding;

public class Parent {
	
	final void bloodGroup()                           // restricting this method from overriding
	{
		System.out.println("AB positive from parent");
	}
	void height()
	{
		System.out.println("170cm");
	}
	

}
