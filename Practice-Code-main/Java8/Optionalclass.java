package Java8;
import java.util.*;

public class Optionalclass {
	public static void main(String[] args) {
		String words[] = new String[10];
		words[0] = "Ali";
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		
		
		    if(checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.println(word);
			
		}
		else {
			System.out.println("word is null");
		}
	}

		
	}

