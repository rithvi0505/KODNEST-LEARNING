package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		sumOfDigits(num);
		System.out.println(sumOfDigits(num));
		scan.close();
	}
	
	public static int sumOfDigits(int num)
	{
		int sum=0;
		int last=0;
		while(num!=0) {
			
		last=num%10;
		sum=sum+last;
		num=num/10;
		}
		return sum;
		
	}

}


