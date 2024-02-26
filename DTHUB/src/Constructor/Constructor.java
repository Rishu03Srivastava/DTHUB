package Constructor;

public class Constructor {
	
	public Constructor()
	{
		System.out.println("Default Constructor");
	}
	public Constructor(int a, int b)
	{
	System.out.println("two Parameterized Constructor"); 
	}
	
	public Constructor(int a, int b, int c)
	{
	System.out.println("Three Parameterized Constructor"); 
	}
	
	public Constructor(int a, int b, int c, int d)
	{
	System.out.println("Four Parameterized Constructor"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Constructor ab = new Constructor();
	Constructor ab1 = new Constructor(3,6);
	Constructor ab2 = new Constructor(2,4,5);
	Constructor ab3 = new Constructor(8,7,4,9);
	

	}

}
