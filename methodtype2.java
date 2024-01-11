
public class methodtype2 {

	public static void main(String[] args) {
		
		int x=add();       // method call
		System.out.println("this is printing from main method "+x);
		
	}
	public static int add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("this is printing from add method "+c);
		return c;
	}

}
