package Collection;
import java.util.*;

public class TreesetaddAll extends Linkedhashset{
	public static void main(String arg[]) {
		Linkedhashset set = new Linkedhashset();
		set.detail();
		TreeSet <Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(32);
		ts.add(13);
		ts.add(31);
		ts.addAll(set.lhs);
		System.out.println(ts);
		
		
		System.out.println("The ceiling value is ="+ts.ceiling(12));
		
		Iterator <Integer> i = ts.descendingIterator();
		//showing hashcode
		System.out.println("The descending value is ="+ts.descendingIterator());
		//descendingSet()
		System.out.println("The descending value is ="+ts.descendingSet());
		
		System.out.println("The descending value is ="+ts.floor(11));
		
		System.out.println("The descending value is ="+ts.headSet(11));
		
		System.out.println(ts.headSet(11, true));
		System.out.println(ts.headSet(11, false));
		
		System.out.println(ts.higher(3));
		
		Iterator<Integer> j = ts.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
	
		System.out.println("The neareast lower number is ="+ts.lower(99));
		
		
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		
		
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		
		ts.spliterator();
	
	}
}
