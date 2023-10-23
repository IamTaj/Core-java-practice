package FlowControl;
import java.util.*;

public class if_else2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.println("The number is zero");
		}
		else if(n>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
		
		
	}

}
