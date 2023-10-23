package ExceptionHandling;

public class Finallyblock {
	public static void main(String str[]) {
		try {
			int div=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception =>"+e.getMessage());
			
		}
		
		finally {
			System.out.println("Finally Execute");
		}
	}
}
