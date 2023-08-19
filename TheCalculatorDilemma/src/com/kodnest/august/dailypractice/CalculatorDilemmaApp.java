package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class CalculatorDilemmaApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=scan.nextInt();
		System.out.println("Enter operation\n+ for addition\n-for subtraction\n*for multiplication\n/ for division");
		char op=scan.next().charAt(0);
		System.out.println("Enter the second number");
		int num2=scan.nextInt();
		calculator(num1,num2,op);
		scan.close();
		
	}
	
		public static void calculator(int num1,int num2,int op) {
			
		switch(op)
		{
		case '+':System.out.println(num1+num2);
				break;
		case '-':System.out.println(num1-num2);
				break;
		case '*':System.out.println(num1*num2);
				break;
		case '/':System.out.println(num1/num2);
				break;
		default:System.out.println("Enter the characters corresponding the operations correctly");
		
		}
		
		
	}

}
