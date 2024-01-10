package com.kodnest.december.collections2;

import java.util.ArrayList;

public class ComplexObjectApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ComplexObject co1=new ComplexObject(2019,"Urfi",6.6F);
		ComplexObject co2=new ComplexObject(2018,"Bhupendra",89.8F);
		ComplexObject co3=new ComplexObject(2023,"Elvish",35.8F);
		
		ArrayList al=new ArrayList();
		al.add(co1);
		al.add(co2);
		al.add(co3);
		System.out.println(al);  //this is always in al.toString form, where toString is insdie the Object class, so override it
		
		
		

	}

}
