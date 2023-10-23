package FlowControl;
import java.util.*;

public class do_while {
	public static void main(String arg[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = 0,i=0;
		
		do {
			sum=sum+i;
			i++;
		}while(i<=n);
		
		System.out.println("The sum is :"+sum);
		
	}
}
