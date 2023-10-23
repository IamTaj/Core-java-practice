package ExceptionHandling;

public class Trycatch1 {
public static void main(String args[]) {
	try {
		int div =5/0;
		System.out.println("Hello World");
	}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception =>"+e.getMessage());
	}
}
}
