package Collection;
import java.util.*;



public class Linkedhashset {
	LinkedHashSet <Integer> lhs= new LinkedHashSet<>();
	void detail() {
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(5);

	}
	
	public static void main(String arg[]) {
		Linkedhashset h = new Linkedhashset();
		h.detail();
		Iterator <Integer> i = h.lhs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
