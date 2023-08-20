package com.Kodnest.methods.methodoverloading;

import java.util.Scanner;

public class DisneyChai {

	public static void main(String[] args) {
		
		while(true) {
		
		menu();}
	}
	
	public static void menu()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("\nHello and welcome to Kodnest Tea Branch");
		System.out.println("Choose your tea:");
		System.out.println("1. Normal Tea Rs10/-\n2.Green Tea Rs15/-\n3.Ginger Tea Rs20/-");
		int teatype=scan.nextInt();
		System.out.println("Enter the the number of cups:");
		int teacups=scan.nextInt();
		
		if(teatype==1)
		{
			Normtea(teacups);
		}
		else if(teatype==2)
		{
			Greentea(teacups);
		}
		else if(teatype==3)
		{
			Gingertea(teacups);
		}
		else
		{
			System.out.println("Enter a valid option");
		}
	}
	
	public static void Normtea(int a)
	{
		System.out.println("Your bill for "+a+" normal tea is "+(10*a));
	}
	
	public static void Greentea(int b)
	{
		System.out.println("Your bill for "+b+" green tea is "+(15*b));
	}
	public static void Gingertea(int c)
	{
		System.out.println("Your bill for "+c+" ginger tea is "+(20*c));
	}
	

}
//writea java program to take name as unout from keyboard and greet the person withbhis name printed along with greeting msg. note: greeting is a task so, keep the task in a separate method and let the method be of type4.


