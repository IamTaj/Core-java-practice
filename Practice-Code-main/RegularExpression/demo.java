package RegularExpression;

import java.util.Scanner;
import java.util.regex.*;

public class demo {
	public static void main(String arg[]) {
//	 String REGEX = "(.*)(for)(.*)?";
	 Scanner sc = new Scanner(System.in);
	 String str = sc.nextLine();
	 while(!str.matches("[a-zA-Z]+")) {
		 System.out.println("Please enter a valid string");
		 str = sc.nextLine();
	 }
	 
	 System.out.println(str);
	 
     // create the string
     // in which you want to search
//     String actualString
//         = "...djashdka....";

     // compile the regex to create pattern
     // using compile() method
//     Pattern pattern = Pattern.compile(REGEX,Pattern.CASE_INSENSITIVE);

     // check whether Regex string is
     // found in actualString or not
//     boolean matches = pattern
//                           .matcher(actualString)
//                           .matches();
//
//     System.out.println("actualString "+ "contains REGEX = "+ matches);

	}
}
