package as1;

public class diceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=1;
		int max=6;
		int range=(max-min)+1;
		for(int i=1;i<=6;i++)
		{
		int res=(int)(Math.random()*range)+min; //the minimum outcome of a dice should be 1
		System.out.println("rolling dice..... "+res);
		}


	}

}
