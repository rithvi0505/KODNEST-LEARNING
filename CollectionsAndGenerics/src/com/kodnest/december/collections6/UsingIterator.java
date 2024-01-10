package com.kodnest.december.collections6;
import java.util.*;

import java.util.ArrayList;

public class UsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		

	}

}
