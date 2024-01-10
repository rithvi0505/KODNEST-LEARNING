package com.kodnest.december.collections;
import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq=new PriorityQueue();		//can't store heterogeneous elements
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(5);
		System.out.println(pq);    // outputs the least element in the first place, nothing with the rest of the elements
		
		PriorityQueue pq3=new PriorityQueue();		//Applied with Strings, brings up the least String wrt Alphabetical order
		pq3.add("Java");
		pq3.add("HTML");
		pq3.add("CSS");
		pq3.add("Python");
		System.out.println(pq3);    // outputs the least element in the first place, nothing with the rest of the elements
		
		
	
		// Throws exception if heterogeneous values are put.
		//Compilation error is better than exception, thats y generics should be applied here too
		
		PriorityQueue<Boolean> pq2=new PriorityQueue<Boolean>();		//can't store heterogeneous elements
		pq2.add(true);
		pq2.add(true);
		pq2.add(30);
		pq2.add("Java");												//its now throwing an error .
		System.out.println(pq2);    // outputs the least element in the first place, nothing with the rest of the elements 
		
		
		

	}

}
