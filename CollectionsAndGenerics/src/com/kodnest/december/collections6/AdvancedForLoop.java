package com.kodnest.december.collections6;
import java.util.*;

public class AdvancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		for(Object x:ad)
		{
			System.out.println(x);
		}
		

	}

}
