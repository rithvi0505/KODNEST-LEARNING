package com.kodnest.august.dailypractice;

public class NumberOfDigitsClass {
	public static int numOfDigits(int num)
	{
		int temp;
		int count=0;
		while(num>0)
		{
			temp=num%10;
			num=num/10;
			count++;
			
		}
		return count;
	}

}
