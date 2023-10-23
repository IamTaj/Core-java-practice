package ExceptionHandling;

public class TestThrow2 {

	public static void eligible(int age) {
		if(age<18) {
			throw new ArithmeticException("Person not eigible to vote");
		}
		else {
			System.out.println("Eligible");
		}
	}
	public static void main(String arg[]) {
		eligible(20);
	}
}
