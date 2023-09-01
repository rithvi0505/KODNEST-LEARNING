package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class Main {
		public static void getProduct(String productCode)

		{
			switch(productCode)
			{
			case "P01": System.out.println("Cocacola");
				break;
			case"P02":System.out.println("Pepsi");
				break;
			case "P03":System.out.println("Fanta");
				break;
			case "P04":System.out.println("JalJeera");
				break;
			case "P05":System.out.println("MountainDew");
				break;
			case "P06":System.out.println("BoatGuava");
				break;
				default:System.out.println("Panaka");
				
			}

		// your code here Cocacola, Pepsi ,Fanta,JalJeera,MountainDew,and BoatGuava

		}

		public static void main(String[] args)

		{
			Scanner scanner = new Scanner(System.in);
			String productCode=scanner.next();
			getProduct(productCode);
			scanner.close();

		}

}


