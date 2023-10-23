package Collection;

import java.util.*;

public class Hmapstudent extends Hmapdeclare {
	public static void main(String arg[]) {

		Hmapdeclare y = new Hmapdeclare();
		y.m();
		System.out.println(y.h);
		// for(Map.Entry m : new y.h.entrySet()) {

		HashMap<Integer, String> h = new HashMap<Integer, String>();
		HashMap<Integer, String> even = new HashMap<Integer, String>();
		HashMap<Integer, String> odd = new HashMap<Integer, String>();
		h.put(1, "Taj");
		h.put(2, "Sonu");
		h.put(3, "Rithik");
		h.put(4, "Kofu");
		h.put(5, "Brata");
		
		int i = 0;
		String s = null;
		int key = 0;
		for (Map.Entry m : h.entrySet()) {
			key = (int) m.getKey();
			if (key % 2 == 0) {

				i = (Integer) m.getKey();
				s = (String) m.getValue();
				even.put(i, s);
			}
			else {
				i = (Integer) m.getKey();
				s = (String) m.getValue();
				odd.put(i, s);
				
			}
		}

		System.out.println("\n\nEven Roll Students are");
		for(Map.Entry m : even.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("\n\nOdd Roll Students are");
		for(Map.Entry m : odd.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
