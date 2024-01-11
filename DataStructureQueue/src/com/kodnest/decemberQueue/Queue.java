package com.kodnest.decemberQueue;
import java.util.Scanner;

public class Queue {
	
	private int []arr;
	int r=-1;
	int f=0;
	private Scanner scan=new Scanner(System.in);
	
	public Queue(int s)
	{
		arr=new int[s];
	}
	
	public void insert()
	{
		if(r==arr.length-1)
		{
			System.out.println("Queue is full");
		}
		else
		{
			System.out.println("enter element"); 
			int elem=scan.nextInt();
			++r;
			arr[r]=elem;
		}
	}
	public void delete()
	{
		if(r<f)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println(arr[f]+" deleted ");
			f++;
		}
	}
	public void display()
	{
		if(r<f||r==-1)
		{
			System.out.println("Queue empty");
		}
		for(int i=f;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
