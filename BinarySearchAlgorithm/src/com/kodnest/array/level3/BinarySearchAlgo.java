package com.kodnest.array.level3;

import java.util.Scanner;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {23,45,67,78,97};
		Scanner scan=new Scanner(System.in);
		System.out.println("search your key");
		int key=scan.nextInt();
		int res=search(key,arr);
		if(res==-1)
			System.out.println("Key not found");
		else
			System.out.println("key found at "+res);
	}
	public static int search(int key,int []arr)
	{
		int low=0,high=arr.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(key==arr[mid])
			{
				return mid;	
			}
			else if(key>arr[mid])
			{
				low=mid+1;	
			}
			else
			{
				high=mid-1;
				//low=low;
			}
			
		}
		return -1;
		
	}

}
