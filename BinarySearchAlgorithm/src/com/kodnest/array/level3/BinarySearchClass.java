package com.kodnest.array.level3;

public class BinarySearchClass {
	public static int search(int k,int []arr)
	{
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(k==arr[mid])
				return mid;
			else if(k>arr[mid])
				low=mid+1;
			else
				high=mid-1;
		}
		return 1;
		
	}

}
