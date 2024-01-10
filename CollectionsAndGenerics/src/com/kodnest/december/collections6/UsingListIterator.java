package com.kodnest.december.collections6;
import java.util.*;

public class UsingListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+" ");
		}
		
		
		

	}

}
