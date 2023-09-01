package com.kodnest.august.dailypractice;

public class PowerNClassSecond {
	public static int powerN(int num,int n)
	{
		int temp=1;
		for(int i=1;i<=n;i++)
		{
			temp=temp*num;
		}
		return temp;
	}


}
