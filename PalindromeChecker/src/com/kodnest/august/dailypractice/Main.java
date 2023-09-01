package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		boolean res=PalindromeClass.palindromeCheck(num);
		scan.close();
		if(res==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("NOT Palindrome");
		}

	}

}
