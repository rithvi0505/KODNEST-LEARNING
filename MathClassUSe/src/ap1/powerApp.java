package ap1;

import java.util.Scanner;

public class powerApp {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		System.out.println("enter the power");
		int p=scan.nextInt();
		System.out.println(Math.pow(num, p));
		scan.close();
	}
	
	

}
