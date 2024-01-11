package com.kodnest.encapsulation;

import java.util.Scanner;

public class EncapsulationTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		System.out.println("enter a string");
		String str=scan.next();
		EncapsulationClass01 e1=new EncapsulationClass01(num,str);
		e1.i=-1;      // here i can assign a value to the instance variable i directly, bypassing the condition in the constructor
		e1.print();
		System.out.println("Integer =" +e1.i);
		System.out.println("String ="+e1.s);

	}
}
