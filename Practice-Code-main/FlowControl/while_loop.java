package FlowControl;
import java.util.*;

public class while_loop {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int sum=0,i=0;
		
		while(i<=n) {
			sum = sum + i;
			i+=1;
		}
		System.out.println("The sum of is :"+sum);
	}
}
