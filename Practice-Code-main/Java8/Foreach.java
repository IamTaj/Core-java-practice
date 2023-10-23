package Java8;

import java.util.*;

public class Foreach {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		
		l.forEach(n -> { System.out.println(n);});
		l.forEach(System.out::print);
		
	}

}
