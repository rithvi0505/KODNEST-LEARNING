package com.kodnest.encapsulation;

import java.util.Scanner;

public class PrivatisedVariableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter age");
		
		int age=scan.nextInt();
		PrivatisedVariable p=new PrivatisedVariable();
	
		p.setAge(age);    // here I have to set the age through this method only.
		
		//p.age=-1;       //this line will throw an error, showing that the method can't be bypassed
		
		
		System.out.println(p.getAge());

	}

}
