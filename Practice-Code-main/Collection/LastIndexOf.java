package Collection;
import java.util.*;

public class LastIndexOf {
	public static void main(String arg[]) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(23);
		a.add(243);
		a.add(236);
		a.add(68);
		a.add(23);
		a.add(68);
	
		System.out.println("The index value of 99 is ="+a.lastIndexOf(23));
		System.out.println("The index value of 99 is ="+a.lastIndexOf(99));
		System.out.println("The index value of 99 is ="+a.lastIndexOf(68));
		
		
		
		
		ArrayList<String> s = new ArrayList<>();
		s.add("White");
		s.add("white");
		s.add("REd");
		s.add("White");
		s.add("Blue");
		s.add("Maroon");
		
		System.out.println("The index value of white is ="+s.lastIndexOf("White"));
		System.out.println("The index value of white is ="+s.lastIndexOf("white"));
		
	}
}
