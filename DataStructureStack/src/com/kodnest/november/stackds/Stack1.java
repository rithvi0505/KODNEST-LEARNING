package com.kodnest.november.stackds;
import java.util.Scanner;

public class Stack1 {
	
	private Scanner scan=new Scanner(System.in);
	private int arr[]=null;
	private int top=-1;
	
	public Stack1(int h)
	{
		arr=new int[h];
	}
	
	void push()
	{
		if(top==arr.length-1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			System.out.println("Enter element: ");
			int element=scan.nextInt();
			++top;
			arr[top]=element;
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			--top;
		}
	}
	
	void display()
	{
		for(int i=top;i>0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
