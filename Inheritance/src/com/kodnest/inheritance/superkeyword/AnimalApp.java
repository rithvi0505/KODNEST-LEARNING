package com.kodnest.inheritance.superkeyword;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t=new Tiger();
		t.makeSound();
		t.accessParentClass();			//accessing parent method from the child class only, without creating the parent object
		
		Animal a=new Animal();			//accessing parent method by creating the parent class object
		a.makeSound();
		
		

	}

}
