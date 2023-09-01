package com.kodnest.august.dailypractice;
import java.util.Scanner;

public class PowerToNumberOfDigitsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int res=PowerNClassSecond.powerN(num,NumberOfDigitsClassSecond.numOfDigits(num));
		System.out.println(res);
		scan.close();

	}

}
