package com.kodnest.linearsearch;

import java.util.Scanner;

public class LinearSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		boolean flag=false;
		int []arr=new int[5];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter element "+(i+1));
			arr[i]=scan.nextInt();
			
		}
		System.out.println("enter key: ");
		
		int key=scan.nextInt();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("key found at index number: "+i);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("key not found");
		scan.close();

	}

}
