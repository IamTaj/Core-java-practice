package FlowControl;
import java.util.*;

public class switch_case {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		switch (n) {
		
		case 1:
			System.out.println("The number is one");
			break;
		
		case 2:
			System.out.println("The number is two");
			break;
			
		default:
			System.out.println("The number is out of range");
		}
	}

}
