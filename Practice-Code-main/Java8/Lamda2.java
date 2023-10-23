package Java8;
import java.util.*;

public class Lamda2 {
	public static void main(String[] args) {
		ArrayList <Integer> ar = new ArrayList<>();
		for(int i =0;i<30;i++) {
		ar.add(i);
		}
		System.out.println("Even numbers");
		ar.forEach(n ->{if(n%2==0) System.out.println(n); });
	
		System.out.println("Odd numbers");
		ar.forEach(n ->{if(n%2!=0) System.out.println(n);});
	}
}
