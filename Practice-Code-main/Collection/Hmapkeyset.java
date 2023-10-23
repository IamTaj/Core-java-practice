package Collection;
import java.util.*;

public class Hmapkeyset {
	public static void main(String ar[]) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		HashMap<Integer, String> even = new HashMap<Integer, String>();
		HashMap<Integer, String> odd = new HashMap<Integer, String>();
		odd.put(1, "Taj");
		even.put(2, "Sonu");
		odd.put(3, "Rithik");
		even.put(4, "Kofu");
		odd.put(5, "Brata");
		even.put(6, "Sartaz");
		
		
		
		//putAll()
		h.putAll(odd);
		System.out.println(h);
		h.putAll(even);
		System.out.println(h);
		
		//putIfAbsent(key,val)
		h.putIfAbsent(7, "Bishal");
		System.out.println(h);
		h.putIfAbsent(7, "Rohit");
		System.out.println(h);
		
		
		h.put(8, "Rohit");
		System.out.println(h);

//		String str = null;
//		int count=0;
//		for(Map.Entry m: h.entrySet()) {
//			count=(Integer)m.getKey();
//			str=(String)m.getValue();
//			if(str.charAt(0)=='R') {
//				h.remove(count);
//			}
//		}
		
		h.remove(2);
		System.out.println(h);
		
		
		//remove(key,val)
		h.remove(3, "Rithik J");
		
		
		System.out.println(h);
		
		//get()
		System.out.println(h.get(3));
		
		
		//replace(key,val)
		h.replace(3, "Rithik Jaiswal");
		System.out.println(h);
		
		
		//putIfAbsent()
		h.putIfAbsent(2, "Soumyajeet");
		System.out.println(h);
		
		//replace(key,old,new)
		h.replace(4, "Kofu","Ritik Pareek");
		System.out.println(h);
	}

}
