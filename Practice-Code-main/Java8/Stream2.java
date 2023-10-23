package Java8;
import java.util.*;
import java.util.stream.Collectors;



public class Stream2 {
public static void main(String[] args) {
	List<String> s = Arrays.asList("Taj","Sonu","Pareek","Brata");
	
	List<String> res = s.stream().filter(r -> r.startsWith("T")).collect(Collectors.toList());
	System.out.println(res);
}
}
