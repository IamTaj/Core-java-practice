package Collection;
import java.util.*;

public class Set_method {
	public static void main(String arg[]) {
		ArrayList i = new ArrayList();
		i.add("Hey");
		i.add("Wassup");
		i.add("Mah");
		i.add("Boi");
		i.add("!");
		
		System.out.println("The list before update ="+i);
		
		i.set(3, "Brother");
		System.out.println("The list after update ="+i);
	}
}
