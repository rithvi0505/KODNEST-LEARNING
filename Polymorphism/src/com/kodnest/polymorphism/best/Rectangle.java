package com.kodnest.polymorphism.best;

public class Rectangle extends Shape {
	
	double l=4.0;
	double b=2.0;
	

	@Override
	double findArea()
	{
		return l*b;
	}
	double findRectPeri()
	{
		return 2*(l+b);
	}

}
