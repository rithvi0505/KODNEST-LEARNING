package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class PalindromeClass {
	/*public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		palindromeCheck(num);
		scan.close(); }*/
		
	public static boolean palindromeCheck(int num)
	{
		int original=num;
		int rev=0;
		while(num>0)
		{
		
		rev=rev*10+num%10;
		num=num/10;
		}
		if(rev==original)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
