package com.kodnest.decemberCircularQueue;
import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Queue size: ");
		int size=scan.nextInt();
		
		CircularQueue q=new CircularQueue(size);
		while(true)
		{
		System.out.println("enter your operation:");
		System.out.println("1............insert");
		System.out.println("2............delete");
		System.out.println("3...........display");
		System.out.println("any other......exit");
		int ch=scan.nextInt();
		switch(ch)
		{
		case 1:q.insert();
		break;
		case 2:q.delete();
		break;
		case 3:q.display();
		break;
		default:System.out.println("program terminated");
		return;
		}
		}


	}

}
