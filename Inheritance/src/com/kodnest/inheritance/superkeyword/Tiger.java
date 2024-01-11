package com.kodnest.inheritance.superkeyword;

public class Tiger extends Animal{
	
	String tigerSound="tiger sound";
	
	public void makeSound()                                    //method overriding
	{
		System.out.println("Tiger is making "+tigerSound);
	}
	public void accessParentClass()
	{
		super.makeSound();             // super keyword, calling the method from parent.     unlike super() method-sends the control to the parent class
	}

}
