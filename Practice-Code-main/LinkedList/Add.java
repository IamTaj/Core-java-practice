package LinkedList;
import java.util.*;

public class Add {
	public static void main(String arg[]) {
		LinkedList <Integer> ar = new LinkedList<>();
		ar.add(32);
		ar.add(54);
		ar.add(32);
		ar.add(89);
		ar.add(69);
		System.out.println(ar);
		ar.pop();
		System.out.println(ar);
		ar.remove(2);
		System.out.println(ar);
		System.out.println(ar.getFirst());
		System.out.println(ar.getLast());
		ar.addLast(96);
		ar.addFirst(345);
		System.out.println(ar);
		System.out.println(ar.get(1));
		
		Collections.sort(ar);
		System.out.println(ar);
		
		ar.add(123);
		ar.add(321);
		ar.remove(0);
		ar.push(9999999);
		System.out.println(ar);
		ar.clear();
		System.out.println(ar);
	}
}
