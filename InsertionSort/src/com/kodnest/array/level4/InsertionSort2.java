package com.kodnest.array.level4;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size:");
		int []arr=new int[scan.nextInt()];
		System.out.println("enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("unsorted array:");
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int []arr)
	{
		int item=0;
		for(int i=1;i<=arr.length-1;i++)
		{
			item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
	}
	
	

		
		
			
					

}


