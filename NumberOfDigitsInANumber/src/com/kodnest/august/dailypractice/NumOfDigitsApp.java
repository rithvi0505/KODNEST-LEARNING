package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class NumOfDigitsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		System.out.println(NumberOfDigitsClass.numOfDigits(num));

	}

}
