package com.kodnest.december.collections2;
import java.util.*;

public class ComplexObject {

	int rollno;
	String name;
	float per;
	
	public ComplexObject(int rollno,String name,float per)
	{
		this.rollno=rollno;
		this.name=name;
		this.per=per;
	}
	

	@Override
	public String toString()
	{
		return rollno+" "+name+" "+per;
	}
	
}
