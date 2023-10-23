package Collection;
import java.util.*;

public class Remove_method {
	public static void main(String arg[]) {
		ArrayList <Integer> ar = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			ar.add(i);
		}
		System.out.println("The value of list ="+ar);
		ar.remove(4);
		System.out.println("The value of list ="+ar);
		
	}
}
