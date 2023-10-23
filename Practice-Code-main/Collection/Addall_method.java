package Collection;
import java.util.*;

public class Addall_method {
	public static void main(String arg[]) {
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("Oye");
	al.add("Wassup");
	al.add("Nigga");
	al.add("!");
	System.out.println("Array list before addAll()"+al);
	
	ArrayList<String> al1 =new ArrayList<String>();
	al1.add("Heads");
	al1.add("Up");
	al1.add("Mah");
	al1.add("Boi");
	
	al.addAll(al1);
	System.out.println("Array List after addAll()"+al);
	}

}
