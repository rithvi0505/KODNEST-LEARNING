package com.kodnest.array.level3;
import java.util.Arrays;

import java.util.Scanner;

public class BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length:");
		int []arr=new int[scan.nextInt()];
		
		System.out.println("enter array elements: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Unsorted array: "+Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array: "+Arrays.toString(arr));

	}

}
