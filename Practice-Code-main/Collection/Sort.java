package Collection;
import java.util.*;

public class Sort {
	public static void main(String arg[]) {
		ArrayList <String> band=new ArrayList<String>();
		
		band.add("Maroon 5");
		band.add("The Local Train");
		band.add("The Chainsmoker");
		band.add("5 Seconds Of Summer");
		band.add("Backstreet Boys");
		band.add("One Direction");
		
		Collections.sort(band);
		System.out.println(band);
		for(String val : band) {
			System.out.println(val);
		
		}
		
	}
}
