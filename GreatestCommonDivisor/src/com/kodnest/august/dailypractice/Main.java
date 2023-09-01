package com.kodnest.august.dailypractice;
import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void findGCD(int a, int b)

	{
		
		int i=Math.min(a,b);
		while((a%i)+(b%i)!=0)
		{
			i--;
		}
		System.out.println(i);
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		findGCD(a,b);
		scan.close();
	}
}
