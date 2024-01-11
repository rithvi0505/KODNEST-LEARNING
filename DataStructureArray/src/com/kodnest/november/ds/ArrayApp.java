package com.kodnest.november.ds;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you want to create an array? enter true or false");
		boolean choice=scan.nextBoolean();
		
		if(choice==true)
		{
			System.out.println("enter array size: ");
			int size=scan.nextInt();
			
			Array1 arr=new Array1(size);
			
			while(true) {
			
				System.out.println("select operations you want to do: ");
			
				System.out.println("1..........INSERT");
				System.out.println("2..........DELETE");
				System.out.println("3.........DISPLAY");
				System.out.println("Any other....STOP");
				int ch=scan.nextInt();
			
				switch(ch)
				{
				case 1: arr.insert();
					break;
				case 2: arr.delete();
					break;
				case 3: arr.display();
					break;
				default: System.out.println("Program terminated");
					return;
				}
			}		
		}
		
		else
		{
			System.out.println("Get lost then!");
		}
	}
}
