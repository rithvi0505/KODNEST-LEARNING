package com.kodnest.december.collections;

import java.util.LinkedList;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(30);
		ll.add(20);
		ll.add("Java");
		ll.add(45.77F);
		System.out.println(ll);
		ll.add(2,true);
		System.out.println(ll);  // it is added in the exact place where we want to , it takes less time to do that as compared to ArrayList
		
		
		LinkedList<String> ll2=new LinkedList<String>();		//Generics
		ll2.add(10);											//cant add values other than Strings
		ll2.add(30);
		ll2.add(20);
		ll2.add("Java");
		ll2.add(45.77F);
		System.out.println(ll2);
		ll2.add(2,true);
		System.out.println(ll2); 
		
		

	}

}
