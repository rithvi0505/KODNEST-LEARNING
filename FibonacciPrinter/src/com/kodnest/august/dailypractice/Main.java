package com.kodnest.august.dailypractice;
import java.util.Scanner;

public class Main {
	public static void printFibonacciSeries(int n)

	{
		int num1=0,num2=1;
		System.out.print(num1+" "+num2);

		for(int i=1;i<=n;i++)
		{
			int nextnum=num1+num2;
			num1=num2;
			num2=nextnum;
			System.out.print(" "+nextnum);
		}
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
	printFibonacciSeries(1);
	}
}
