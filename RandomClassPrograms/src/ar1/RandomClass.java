package ar1;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		for(int i=1;i<=6;i++)
		{
		int dice=rand.nextInt(6)+1;
		System.out.println(dice);
		}

	}

}
