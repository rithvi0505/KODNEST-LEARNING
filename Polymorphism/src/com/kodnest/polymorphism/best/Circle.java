package com.kodnest.polymorphism.best;

public class Circle extends Shape {
	double radius=5.5;

	@Override
	double findArea()
	{
		return Math.PI*radius*radius;
	}
	double findCirclePeri()
	{
		return 2*Math.PI*radius;
	}

}
