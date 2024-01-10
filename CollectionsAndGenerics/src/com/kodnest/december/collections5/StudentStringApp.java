package com.kodnest.december.collections5;
import java.util.*;

public class StudentStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentString ss1=new StudentString(3,"Chetan",98.8f);
		StudentString ss2=new StudentString(1,"Anuj",78.7f);
		StudentString ss3=new StudentString(2,"Balram",67.2f);
		
		ArrayList al=new ArrayList();
		al.add(ss1);
		al.add(ss2);
		al.add(ss3);
		System.out.println("Unsorted: "+al);
		
		Collections.sort(al);
		System.out.println("Sorted: "+al);

	}

}
