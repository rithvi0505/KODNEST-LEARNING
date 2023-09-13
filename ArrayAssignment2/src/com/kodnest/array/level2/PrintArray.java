package com.kodnest.array.level2;

public class PrintArray {
	public static void printArray(int []arr)
	{
		
		System.out.println("array contents in forward direction:");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	System.out.println("array in reverse direction:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}   
		
	}


}
