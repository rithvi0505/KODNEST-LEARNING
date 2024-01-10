package com.kodnest.december.collections3;

public class Student implements Comparable<Student>{
	
	int roll;
	String name;
	float per;
	
	public Student(int roll,String name,float per)
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
	
	@Override
	public String toString()
	{
		return roll+" "+name+" "+per;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.roll<o.roll)			//checking whether the next roll coming to this method is greater than the previous one or not
		{
			return -1;
		}
		else if(this.roll>o.roll)
		{
			return 1;
		}
		else
		return 0;
	}
	
	

}
