package Collection;
import java.util.*;

public class Hmapdeclare {
	HashMap<Integer, String> h = new HashMap<Integer, String>();
	public void m() {
		
		h.put(1, "Taj");
		h.put(2, "Sonu");
		h.put(3, "Rithik");
		h.put(4, "Kofu");
		h.put(5, "Brata");
		
	}
	public static void main(String arg[]) {
		Hmapdeclare d = new Hmapdeclare();
		d.m();
		
		System.out.println(d.h);
		for(Map.Entry m : d.h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	

}
