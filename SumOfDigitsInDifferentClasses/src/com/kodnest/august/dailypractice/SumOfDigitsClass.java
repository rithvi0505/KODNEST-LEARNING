package com.kodnest.august.dailypractice;

public class SumOfDigitsClass {
	
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
