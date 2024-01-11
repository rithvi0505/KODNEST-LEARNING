package com.kodnest.array.level4;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortMain {

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
		SelectionSortClass.sort(arr);
		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(arr));
		

	}

}
