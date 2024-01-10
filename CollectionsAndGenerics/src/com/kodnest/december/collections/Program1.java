
package com.kodnest.december.collections;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();		//can include heterogeneous elements
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("java");
		al.add(75.6F);
		al.add(true);
		System.out.println(al);
		
		ArrayList <Integer>al2=new ArrayList<Integer>();		//Generics
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add("java");										//cant add any other values other than Integer
		al2.add(75.6F);
		al2.add(true);
		System.out.println(al2);
		
		

	}

}
