package ExceptionHandling;

public class Exception_Propagation {
	void m() {
		int i = 50/0;
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		}
		catch(ArithmeticException e){
			System.out.println("Exception Handled");
			
		}
	}
	public static void main(String str[]) {
		Exception_Propagation ep =new Exception_Propagation();
		ep.p();
		System.out.println("Normal Flow");
	}
	
}
