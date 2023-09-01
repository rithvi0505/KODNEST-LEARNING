package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class SumOfDigitsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int res=SumOfDigitsClass.sumOfDigits(num);
		System.out.println(res);
		scan.close();

	}

}
