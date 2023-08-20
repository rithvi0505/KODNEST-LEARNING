
public class methodtype4 {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		int ret=sub(a,b); /* method call and storing
		                     the return value in a 
		                    variable of type integer.*/
		
		System.out.println("Printing from the main method "+ret);
	}
	
	public static int sub(int x,int y)
	{
		int z=x+y;
		System.out.println("printing from the sub method "+z);
		return z;
		
	}

}
