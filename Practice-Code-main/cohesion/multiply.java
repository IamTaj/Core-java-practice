package cohesion;

public class multiply {
	
	//global variables
	
	int a = 32;
	int b = 29;
	
	public int multy(int a, int b)
	{
		this.a = a;
		this.b = b;
		return a * b;
	}
}

class display {
	
	public static void main(String args[])
	{
		
		multiply m = new multiply();
		System.out.println(m.multy(9, 6));
	
	}
}
