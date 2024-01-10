package com.kodnest.december.collections6;
import java.util.*;

public class UsingDescendingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		Iterator ditr=ad.descendingIterator();		//gives output in reverse order.  Works only with ArrayDeque
		while(ditr.hasNext())
		{
			System.out.print(ditr.next()+" ");
		}

	}

}
