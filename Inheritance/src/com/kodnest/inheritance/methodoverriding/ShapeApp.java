package com.kodnest.inheritance.methodoverriding;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape ref;
		ref=new Square();
		ref.draw();
		System.out.println(ref.findArea());
		ref=new Rectangle();
		ref.draw();
		System.out.println(ref.findArea());
		ref=new Circle();
		ref.draw();
		System.out.println(ref.findArea());
		

	}

}
