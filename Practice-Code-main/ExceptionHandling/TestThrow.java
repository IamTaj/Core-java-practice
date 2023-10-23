package ExceptionHandling;

public class TestThrow {
	public static void checkNum(int num) {
		if(num<1) {
			throw new ArithmeticException("\nNumber is negative");
		}
		else {
			System.out.println("Square is ="+(num*num));
		}
	}
	public static void main(String arg[]) {
		TestThrow t = new TestThrow();
		t.checkNum(-3);
		System.out.println("Rest of the code");
	}

}
