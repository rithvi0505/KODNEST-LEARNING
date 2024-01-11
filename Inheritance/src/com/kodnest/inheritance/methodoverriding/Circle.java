package com.kodnest.inheritance.methodoverriding;

public class Circle extends Shape{
	
	double r;
	
	void draw()
	{
		System.out.println("draw circle");
	}
	double findArea(double r)
	{
		return Math.PI*r*r;
	}

}
