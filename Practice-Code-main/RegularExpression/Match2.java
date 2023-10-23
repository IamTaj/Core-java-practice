package RegularExpression;
import java.util.*;
import java.util.regex.*;

public class Match2 {
	public static void main(String ar[]) {
		Pattern pattern = Pattern.compile("Tajuddin");
		Matcher matcher = pattern.matcher("Tajuddin");
		
			
		if(matcher.matches()) {
			System.out.println("The string matched");
		
			}
		else {
			System.out.println("The string didn't matched");
		}
		
	}
}
