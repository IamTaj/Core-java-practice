package RegularExpression;
import java.util.*;
import java.util.regex.Pattern;

public class Match1 {
	public static void main(String arg[]) {
		System.out.println(Pattern.matches("Nigga", "Nigga"));
		System.out.println(Pattern.matches("Nigga", " Nigga"));
		System.out.println(Pattern.matches("Nigga\t", "Nigga"));
		System.out.println(Pattern.matches("123Nigga", "123Nigga"));
		System.out.println(Pattern.matches("", ""));
		
		//Exception
		System.out.println(Pattern.matches("", null)); 
	}
}
