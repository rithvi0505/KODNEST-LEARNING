package com.kodnest.inheritance.superkeyword;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		
		c.draw();											//calling inherited method
		
		System.out.println(c.calculateArea());				//calling overridden method
		
		System.out.println(c.calculatePerimeter());			//calling child-specific method

	}

}
