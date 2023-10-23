package Java8;
import java.util.*;

public class Stringjoiner {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Tajuddin");
		names.add("Soumyajeet");
		names.add("Ritik Jaiswal");
		
		StringJoiner sj = new StringJoiner(",");
		StringJoiner sj2 = new StringJoiner("*");
		
		sj.add(names.get(0)).add(names.get(1));
		System.out.println(sj);
		System.out.println("Lenght of 1st"+sj.length());

		
		sj2.add(names.get(1)).add(names.get(2));
		System.out.println(sj2);
		System.out.println("Lenght of second" +sj2.length());
		
		sj.merge(sj2);
		System.out.println(sj);
		System.out.println("The lenght of the merged string is "+sj.length());
		
		
		
	}
}
