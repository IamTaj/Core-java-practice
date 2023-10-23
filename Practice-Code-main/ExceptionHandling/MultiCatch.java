package ExceptionHandling;
import java.util.*;

class Try {

	public int arr[]= new int[10];
	public void list() {
	
	
	try {
		arr[10]= 11;
	}
	catch(IndexOutOfBoundsException e1) {
		System.out.println("IndexOutOfBoundsException =>"+e1.getMessage());
		
	}
	
	catch(NumberFormatException e2) {
		System.out.println("NumberFormatException =>"+e2.getMessage());
	}
}

class TryCatch2{
	public static void main(String arg[]) {
		Try t =new Try();
		t.list();

	
		}
	}
}