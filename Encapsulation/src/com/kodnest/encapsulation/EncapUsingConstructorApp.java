package com.kodnest.encapsulation;

import java.util.Scanner;

public class EncapUsingConstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		EncapUsingConstructor e=new EncapUsingConstructor(num);
		e.print();
		System.out.println(e.a);

	}

}
