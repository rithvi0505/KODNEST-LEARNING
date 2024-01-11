package com.kodnest.array.level3;
import java.util.Arrays;

import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size: ");
		int []arr=new int[scan.nextInt()];
		System.out.println("enter elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("enter key");
		int k=scan.nextInt();
		int res=BinarySearchClass.search(k,arr);
		if(res==1)
			System.out.println("key NOT found");
		else
			System.out.println("key found at "+res);
		

	}

}
