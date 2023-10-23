package Collection;
import java.util.*;

public class IndexOf_method {
	public static void main(String arg[]) {
		ArrayList <String> c = new ArrayList<>(5);
		c.add("Taj");
		c.add("Ritik");
		c.add("Joto");
		c.add("Sonu");
		c.add("Jaiswal");
		
		System.out.println("The number of students present ="+c.size());
		for(String value : c) {
			System.out.println(value);
		}
		int pos1=c.indexOf("Sonu");
		if(pos1==-1) {
			System.out.println("This element does not exist");
		}
		else {
		System.out.println("The order of Sonu is = "+(pos1+1));
		}
		int pos2=c.indexOf("Bando");
		if(pos2==-1) {
			System.out.println("This element does not exist");
		}
		else {
		System.out.println("The order of Sonu is = "+(pos2+1));
		}
	}
}