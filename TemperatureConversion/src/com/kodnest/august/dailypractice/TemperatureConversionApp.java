package com.kodnest.august.dailypractice;
import java.util.Scanner;

public class TemperatureConversionApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("WELCOME TO THE TEMPERATURE CONVERSION TOOL!!!");
		System.out.println("Choose your conversion\n1.Celcius to Fahrenheit\n2.Fahrenheit to Celcius");
		int op=scan.nextInt();
		switch(op)
		{
		case 1: System.out.println("Enter temperature in celcius");
				double C=scan.nextDouble();
		
				System.out.println(celciusToFahrenheit(C)+" degree fahrenheit");
				break;
		case 2:	System.out.println("Enter temperature in Fahrenheit");
				double F=scan.nextDouble();
		
				System.out.println(fahrenheitToCelcius(F)+" degree celcius");
				break;	
		default: System.out.println("Chose the option correctly");
			
		}
		
		
		
	}
	
	public static double celciusToFahrenheit(double C)
	{
		return (C*9/5) + 32;
	}
	
	public static double fahrenheitToCelcius(double F)
	{
		return (F - 32) * 5/9;
	}

}
