package FlowControl;
import java.util.*;

public class continue_code {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum=0,j=0;
		
		for(int i =0; i<n; i++) {
			
			if(i>5 && i<10) {
				continue;
			}
			
			System.out.println("The number is :"+i);
			
					
			
			if(i!=10) {
				sum=sum+i;
			}
			else {
				break;
			}
		}
		System.out.println("The sum of number till " + j +" is :" + sum);
	}
}
