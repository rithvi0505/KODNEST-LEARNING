package com.Kodnest.methods.methodoverloading;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buff2 {
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter your first name:");
		
		InputStreamReader in= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		String name=br.readLine();
		System.out.println("Hello "+name+"! Welcome to the BufferedReader check!");
		
	}

}
