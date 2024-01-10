package com.kodnest.december.collections5;

public class StudentString implements Comparable<StudentString>{
	int roll;
	String name;
	float per;
	
	public StudentString(int roll, String name, float per)
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
	public int compareTo(StudentString o) {
		// TODO Auto-generated method stub
		if(this.name.compareTo(o.name)>0)
		{
			return 1;
		}
		
		else if(this.name.compareTo(o.name)<0)
		{
			return -1;
		}
		else
		return 0;
	}
	

}
