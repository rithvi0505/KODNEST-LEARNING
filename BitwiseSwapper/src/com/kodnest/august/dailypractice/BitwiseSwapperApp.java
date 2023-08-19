package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class BitwiseSwapperApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first integer");
		int num1=scan.nextInt();
		System.out.println("Enter second integer");
		int num2=scan.nextInt();
		System.out.println();
		swapUsingBitwise(num1,num2);

	}
	
	public static void swapUsingBitwise(int num1,int num2)
	{
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("Swapped\nfirst integer= "+num1+"\nsecond integer= "+num2);
	}

}
