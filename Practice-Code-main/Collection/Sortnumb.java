package Collection;
import java.util.*;

public class Sortnumb {
	public static void main(String arg[]) {
		ArrayList <Integer> num = new ArrayList<>();
		num.add(4261873);
		num.add(76);
		num.add(98);
		num.add(1);
		num.add(993);
		num.add(43);
		
		Collections.sort(num);
		for(int val : num) {
			System.out.println(val);
		}
	}
}
