package p2;

public class ArmstrongsForAnyNumberClassCheck {
	public static boolean armCheck(int num,int dig)
	{
		int var=0;
		int temp=0;
		int org=num;
		
		while(num>0)
		{
			temp=num%10;
			num=num/10;
			int i=0;
			int cube=1;
			//System.out.println("entering first while");
			while(i++<dig)
			{
			
			cube=cube*temp;
			//System.out.println("cube from inner while "+cube);
			}
			var=var+cube;
		}
		//System.out.println("var from armsCheck is "+var);
		if(var==org)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
