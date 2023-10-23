package ExceptionHandling;

public class Throws {

	public static int divide(int n, int m)throws ArithmeticException{
		int div =n/m;
		return div;
	}
	
	public static void main(String arg[]) {
		Throws t = new Throws();
		try {
			System.out.println(t.divide(45,0));
		}
		catch(ArithmeticException e) {
			System.out.println("Num cannot be divide by 0");
		}
		System.out.println("Rest of the code");
	}
}
