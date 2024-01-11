package com.kodnest.august.controlconstructs;
import java.util.Scanner;
public class TryingIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		String name=scan.nextLine();
		if(name.equals("Male"))
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("Not");
		}

	}

}
