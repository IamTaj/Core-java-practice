package Collection;
import java.util.*;

public class Addall2 {
	public static void main(String arg[]) {
		ArrayList <Integer> i = new ArrayList<Integer>();
		
		i.add(1);
		i.add(69);
		i.add(96);
		i.add(80085);
		System.out.println("The numbers are"+i);
		
		ArrayList <Integer> i2 = new ArrayList<Integer>();
		i2.add(04);
		i2.add(4);
		i2.add(40);
		i2.add(400);
		
		i.addAll(i2);
		System.out.println("Updated List are "+i);
	}
		
}
