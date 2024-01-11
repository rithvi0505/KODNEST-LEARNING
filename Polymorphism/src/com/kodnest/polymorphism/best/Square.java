package com.kodnest.polymorphism.best;

public class Square extends Shape {
	
	
	double side=5.5;

	@Override				//annotation
	double findArea()
	{
		return side*side;
	}
	double findSqPeri()
	{
		return side*4;
	}
}
