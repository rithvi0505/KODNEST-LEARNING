package com.kodnest.inheritance.methodoverriding;

public class Square extends Shape {
	
	double side=5.0;
	void draw()
	{
		System.out.println("draw square");
	}
	
	double findArea()
	{
		return side*side;
	}

}
