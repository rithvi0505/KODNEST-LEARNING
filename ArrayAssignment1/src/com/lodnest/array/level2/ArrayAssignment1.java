package com.lodnest.array.level2;
import java.util.Scanner;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length:");
		int []arr=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("Array before swap===> ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("enter the indexes you want to swap: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=arr[a];
		arr[a]=arr[b];
		arr[b]=c;
		System.out.print("Array after swap===> ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]);	
		}
	}
}
