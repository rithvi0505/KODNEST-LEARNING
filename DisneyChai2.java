package com.Kodnest.methods.methodoverloading;

public class DisneyChai2 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to DisneyChai.");
		System.out.println("Normal chai is Rs10\nGinger tea is Rs15\nGreen tea is Rs20 ");

		teaBill();
		teaBill("ginger");
		teaBill(10);
		teaBill("green", 5);
	}
	public static void teaBill()
	{
		System.out.println("Bill for normal tea is Rs10/-");
	}
	public static void teaBill(String type)
	{
		System.out.println("Bill for "+ type + " tea is "+ 15+"/-");
		
	}
	public static void teaBill(int num)
	{
		System.out.println("Bill for "+num+ " teas is "+(10*num));
	}
	public static void teaBill(String type, int num)
	{
		System.out.println("Bill for "+num+" green tea is "+(20*num));
	}

}
