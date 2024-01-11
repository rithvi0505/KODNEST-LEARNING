package com.kodnest.inheritance.methodoverriding;

public class Rectangle extends Shape{
	
	double l=2.0;
	double b=5.0;
	
	void draw() {
		System.out.println("draw rectangle");
	}
	
	double findArea()
	{
		return l*b;
	}

}
