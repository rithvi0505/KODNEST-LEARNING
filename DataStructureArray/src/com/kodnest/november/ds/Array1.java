package com.kodnest.november.ds;

import java.util.Scanner;

public class Array1 {
	
	private Scanner scan=new Scanner(System.in);
	
	private int arr[]=null;
	
	
	public Array1(int n)
	{
		arr=new int[n];
		
	}
	
	void insert()
	{
		System.out.println("enter position to put the element :");
		int pos=scan.nextInt();
		System.out.println("enter element :");
		int element=scan.nextInt();
		arr[pos]=element;
		
	}
	void delete()
	{
		System.out.println("enter position from where you want to delete :");
		int pos=scan.nextInt();
		arr[pos]=0;
	}
	void display()
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
