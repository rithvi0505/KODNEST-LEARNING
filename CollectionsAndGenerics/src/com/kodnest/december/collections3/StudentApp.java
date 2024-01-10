package com.kodnest.december.collections3;
import java.util.*;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(3,"Chadarmod",69.9f);
		Student s2=new Student(1,"Lhenkaboda",12.5f);
		Student s3=new Student(2,"Chetibod",98.7f);
		
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("Unsorted: "+al);
		
		//Sorting them
		
		Collections.sort(al);
		System.out.println("Sorted: "+al);
		
		

	}

}
