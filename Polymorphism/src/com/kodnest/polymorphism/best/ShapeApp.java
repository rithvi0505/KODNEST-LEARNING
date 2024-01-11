package com.kodnest.polymorphism.best;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square();;
		Circle cl=new Circle();
		Rectangle rc=new Rectangle();
		activity(sq);
		System.out.println("==============================");
		activity(cl);
		System.out.println("==============================");
		activity(rc);
	}
	
	public static void activity(Shape sh)
	{
		sh.draw();
		System.out.println(sh.findArea());
		
		if(sh instanceof Square)		//using instance of keyword to tell the compiler that the variable sh here is an instance of Square class.
		{
		System.out.println(((Square)(sh)).findSqPeri());
		}
		else if(sh instanceof Circle)
		{
		System.out.println(((Circle)(sh)).findCirclePeri());
		}
		else {
		System.out.println(((Rectangle)(sh)).findRectPeri());
		}
	}
}
