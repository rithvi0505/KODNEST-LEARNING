package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class TaxCalculatorApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double pur=scan.nextDouble();
		System.out.println("Enter the tax rate:");
		double taxRate=scan.nextDouble();
		scan.close();
		System.out.println("Your total Bill is "+calculateTotalWithTax(pur,taxRate));
		
		

	}
	public static double calculateTotalWithTax(double pur,double taxRate)
	{
		return pur+(pur*taxRate);
	}

}
