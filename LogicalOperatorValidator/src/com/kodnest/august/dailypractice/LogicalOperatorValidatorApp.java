package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class LogicalOperatorValidatorApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Is Input Valid?(true/false):");
		boolean input=scan.nextBoolean();
		System.out.println("Does the input meet a certain condition?");
		boolean condition=scan.nextBoolean();
		System.out.println(isValidInput(input,condition));
		scan.close();

	}
	
	public static boolean isValidInput(boolean input, boolean condition)
	{
		
		return input&&condition;
	}

}
