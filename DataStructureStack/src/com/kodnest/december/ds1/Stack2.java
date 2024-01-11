package com.kodnest.december.ds1;

import java.util.Scanner;

public class Stack2 {
	
	private int []arr=null;
	private int top=-1;
	private Scanner scan=new Scanner(System.in);
	
	public Stack2(int n)
	{
		arr=new int[n];
	}
	
	public void push()
	{
		if(top==arr.length-1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			System.out.println("enter the element: ");
			int elem=scan.nextInt();
			++top;
			arr[top]=elem;
		}
	}
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		System.out.println("popped "+arr[top]);
		top--;
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else {
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		} }
	}
	

}
