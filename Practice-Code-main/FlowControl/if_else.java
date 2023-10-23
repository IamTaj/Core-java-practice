package FlowControl;
import java.util.Scanner;

public class if_else {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int a = sc.nextInt();
		
		if(a > 0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
	}
}
