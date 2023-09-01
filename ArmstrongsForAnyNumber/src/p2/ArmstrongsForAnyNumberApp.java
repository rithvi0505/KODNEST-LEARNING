package p2;

import java.util.Scanner;

public class ArmstrongsForAnyNumberApp {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int dig=ArmstrongsAnyNumberClass.armstrongsDigit(num);
		boolean isArm= ArmstrongsForAnyNumberClassCheck.armCheck(num,dig);
		if(isArm==true)
		{
			System.out.println(num+" is an Armstrong's Number");
		}
		else
		{
			System.out.println(num+" is NOT an Armstrong's Number");
		}
		scan.close();

	}
	
	
	
	
	
	
	
	
	

}
