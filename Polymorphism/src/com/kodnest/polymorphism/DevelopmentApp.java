package com.kodnest.polymorphism;

public class DevelopmentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	BackEndDev bed=new BackEndDev();
		DatabaseDev dbd=new DatabaseDev();
		WebDev wbd=new WebDev();
		
		Development dt=new Development();
		dt.activity(bed);
		dt.activity(dbd);
		dt.activity(wbd); */
		
		Developer ref;
		ref=new BackEndDev();     //upcasting- assigning Backend Developer object to Developer refernce
		ref.attendMeeting();
		ref.project();
	//	ref.learnJava();		//child specific method    //Disadvantage of upcasting---.
		
		ref=new DatabaseDev();		//upcasting- assigning Database Developer object to Developer refernce
		ref.attendMeeting();
		ref.project();
//		ref.learnSQL();			//child specific
		
		ref=new WebDev();			//upcasting- assigning Web Developer object to Developer refernce
		ref.attendMeeting();
		ref.project();
	//	ref.learnHTML();		//child specific
		

	}

}
