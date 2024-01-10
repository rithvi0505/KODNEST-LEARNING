package com.kodnest.december.collections6;
import java.util.*;

public class TraditionalForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Bhupendra Jogi");
		al.add(69.69f);
		al.add(true);
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i)+" ");
		}
		
		

	}

}
