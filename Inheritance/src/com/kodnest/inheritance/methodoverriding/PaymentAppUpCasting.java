package com.kodnest.inheritance.methodoverriding;

public class PaymentAppUpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment ref1;
		ref1=new UPI();
		ref1.bill();
		ref1.offer();
		ref1.pay();
		
		Payment ref2;
		ref2=new Wallet();
		ref2.bill();
		ref2.offer();
		ref2.pay();
		
		Payment ref3;
		ref3=new Card();
		ref3.bill();
		ref3.offer();
		ref3.pay();
		

	}

}
