package ExceptionHandling;

public class TestThrowThrows {

	static void m1() throws ArithmeticException{
		System.out.println("Inside the method");
		throw new ArithmeticException("throwing ArithmeticException");
	}
	public static void main(String arg[]) {
		try
		{
			m1();
		}
		catch(ArithmeticException e) {
			System.out.println("caught in the main");
		}
	}
}


