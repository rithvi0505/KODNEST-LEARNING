package com.kod.august.assignments;

public class LabelledDowhileApp {

	public static void main(String[] args) {
		
		int i=1;
		ironman:do {
			System.out.print("hello ");
			i++;
			int j=1;
			do {
				System.out.print("inside ");
				j++;
				break ironman;
			}while(j<=5);

		}while(i<=5);
	}

  }


