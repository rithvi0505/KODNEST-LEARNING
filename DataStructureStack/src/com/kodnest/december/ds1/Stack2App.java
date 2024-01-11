package com.kodnest.december.ds1;
import java.util.*;

public class Stack2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of stack: ");
		Stack2 s=new Stack2(scan.nextInt());
		while(true) {
		System.out.println("enter the operation you want to do:");
		System.out.println("1...........push");
		System.out.println("2............pop");
		System.out.println("3........display");
		System.out.println("Any other...exit");
		int ch=scan.nextInt();
		switch(ch)
		{
		case 1:s.push();
			break;
		case 2:s.pop();
			break;
		case 3:s.display();
			break;
			default: System.out.println("program terminated");
			return;
		}
	  }
	}
}
