package com.kodnest.inheritance.methodoverriding;

public class Child extends Parent {
	
	void height()
	{
		System.out.println("180cm, overridden");               //overridden method
	}
	
	void skill()
	{
		System.out.println("play guitar");                 //child-specific method
	}
	

}
