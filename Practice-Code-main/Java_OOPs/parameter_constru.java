package Java_OOPs;
import java.util.*;

public class parameter_constru {
	private String name;
	
	
	public parameter_constru(String nm) {
		this.name=nm;
	}
	public String getName() {
		return name;
	}
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String nm=sc.nextLine();
		parameter_constru pc = new parameter_constru(nm); 
		System.out.println(pc.name);
		
	}
}
