package com.kodnest.array.level4;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		int []arr=new int[scan.nextInt()];
		System.out.println("enter elements: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("unsorted array");
		System.out.println(Arrays.toString(arr));
		int min=0,pos=0,temp=0;
		
		for(int i=0;i<=arr.length-2;i++)
		{
			min=arr[i];
			pos=i;
			
			for(int j=i;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		System.out.println("sorted array: ");
		System.out.println(Arrays.toString(arr));
	}

}
