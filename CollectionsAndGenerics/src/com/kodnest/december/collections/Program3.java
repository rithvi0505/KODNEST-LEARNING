package com.kodnest.december.collections;
import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(30);
		ad.add("python");
		ad.add('A');
		ad.add(45.6F);
		System.out.println(ad);
		//ad.add(2,70);   compilation error, since ArrayDeque cant insert elements in between

		ad.addLast(100);   //can add in the last or the first
		ad.addFirst(true);
		System.out.println(ad);
		
		
		ArrayDeque<Integer> ad2=new ArrayDeque<Integer>();		//generics
		ad2.add(10);
		ad2.add(30);
		ad2.add("python");										//cant take other values than Integers
		ad2.add('A');
		ad2.add(45.6F);
		System.out.println(ad2);
		//ad.add(2,70);   compilation error, since ArrayDeque cant insert elements in between

		ad2.addLast(100);   //can add in the last or the first
		ad2.addFirst(true);
		System.out.println(ad2);
	}

}
