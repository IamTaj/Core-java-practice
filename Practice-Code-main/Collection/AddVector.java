package Collection;
import java.util.*;

public class AddVector {
	public static void main(String arg[]) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i =0;i<10;i++) {
			v.add(i);
		}
		System.out.println(v);
		v.add(2,999);
		System.out.println(v);
		Vector v1 = new Vector();
		v1.add(123);
		v1.add(7893);
		v1.add(323);
		v1.add(433);
		v.addAll(v1);
		System.out.println(v);
		v.addElement(v1);
		System.out.println(v);
		v.addAll(0, v1);
		System.out.println(v);
		v.addElement(v1);
		
		System.out.println("\n\nRemove Function\n\n");
		
		v.remove(4);
		System.out.println(v);
		v.remove(v1);
		System.out.println(v);
		v.removeElement(v1);
		System.out.println(v);
		v.removeElementAt(7);
		System.out.println(v);
		//v.clear();
		
		System.out.println("\n\n Get Method");
		System.out.println(v.get(5));
		System.out.println(v.elementAt(5));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		
		System.out.println("\n\n Size\n\n");
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.elements());
		
		//v.re
		//System.out.println(v.peek());
	}
}
