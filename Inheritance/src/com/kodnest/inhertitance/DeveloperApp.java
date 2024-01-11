package com.kodnest.inhertitance;

public class DeveloperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer d=new Developer();
		d.coding();
		System.out.println("===========================");
		
		FrontendDev f=new FrontendDev();
		f.coding();
		f.frontEndProject();
		System.out.println("===========================");
		
		
		BackendDev b=new BackendDev();
		b.coding();
		b.backEndProject();
		System.out.println("===========================");
		
		
		JavaDev j=new JavaDev();
		j.coding();
		j.javaDev();
		System.out.println("===========================");

	}

}
