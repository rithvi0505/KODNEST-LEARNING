package p2;

public class ArmstrongsAnyNumberClass {
	public static int armstrongsDigit(int num)
	{
		int count=0;
	//	int temp=0;
		while(num>0)
		{
		//	temp=num%10;
			num=num/10;
			count++;
		}
		//System.out.println("from armstrongsDigit ,count is "+count);
		return count;
	}


}
