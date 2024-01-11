package com.kodnest.november.stackds;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("do you want to create a stack? Say true or false");
		boolean choice=scan.nextBoolean();
		if(choice==true)
		{
			System.out.println("enter the height of stack: ");
			int height=scan.nextInt();
			Stack1 s=new Stack1(height);
			
			while(true)
			{
				System.out.println("enter the operation you want to do: ");
				System.out.println("1..............Push");
				System.out.println("2...............Pop");
				System.out.println("3...........Display");
				System.out.println("Any number.....Stop");
				int ch=scan.nextInt();
				
				switch(ch)
				{
				case 1: s.push();
					break;
				case 2: s.pop();
					break;
				case 3: s.display();
					break;
				default: System.out.println("Program terminated");
					return;	
					
				}
			}
		}

	}

}
