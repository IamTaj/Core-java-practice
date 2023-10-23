package Collection;
import java.util.*;

public class Get_method {
	public static void main(String arg[]) {
		ArrayList<Character> ch = new ArrayList<>();
		for(char c='A';c<='Z';c++) {
			ch.add(c);
		}
		System.out.println("The value is ="+ch.get(4));
	}
}
