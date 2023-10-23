package FlowControl;

public class Pattern1_while {
	public static void main(String args[]) {
		int i=0,j=0;
		
		while(i<5) {
			while(j<5) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j=i;
		}
	}
}
