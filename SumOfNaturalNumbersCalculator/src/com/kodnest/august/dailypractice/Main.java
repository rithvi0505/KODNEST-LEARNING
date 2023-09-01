package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class Main {


	public static void calculateSum(int n)

	{
		int temp=0;
		for(int i=1;i<=n;i++)
		{
			temp=temp+i;
			System.out.println(temp);
		}

	// your code here

	}

	public static void main(String[] args)

	{

		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		calculateSum(num);
	}

}
