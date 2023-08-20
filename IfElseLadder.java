package com.kodnest.august.controlconstructs;

public class IfElseLadder {

	public static void main(String[] args) {
		
		float num= 1.11f;
		 if(num>=5)
		 {
			 System.out.println("hello its greater than 5");
		 }
		 else if(num>=4 && num<5)
		 {
			 System.out.println("hello it is greater than 4 and less than 5");
		 }
		 else if(num>=3 && num<4)
		 {
			 System.out.println("hello its greater than 3 and less than 4");
		 }
		 else
		 {
			 System.out.println("Hello its less than 3");
		 }
	}

}
