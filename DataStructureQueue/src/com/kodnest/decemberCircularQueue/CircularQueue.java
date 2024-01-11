package com.kodnest.decemberCircularQueue;
import java.util.*;

public class CircularQueue {
	
	private int []arr;
	private int size;
	private int f=0;
	
	private int r=-1;
	private int count=0;
	private Scanner scan=new Scanner(System.in);
	
	public CircularQueue(int size)
	{
		this.size=size;
		arr=new int[size];
	}
	
	public void insert()
	{
		if(count==size)
		{
			System.out.println("queue is full");
		}
		else
		{
			System.out.println("enter element: ");
			int elem=scan.nextInt();
			r=(r+1)%size;
			arr[r]=elem;
			count++;
		}
	}
	
	public void delete()
	{
		if(count==0)
		{
			System.out.println("queue is empty");
		}
		else
		{
			f=(f+1)%size;
			System.out.println("f is "+f);
			count--;
		}
	}
	
	public void display()
	{
		int f1=f;		//never mess with the original f
		if(count==0)
		{
			System.out.println("queue is empty, nothing to display");
		}
		else
		{
			System.out.println("f is "+f); ;
			for(int i=1;i<=count;i++)
			{
				
				System.out.print(arr[f1]+" ");
				f1=(f1+1)%size;
			}
			System.out.println();
		}
	}
	

}
