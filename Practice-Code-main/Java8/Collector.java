package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collector {
	public static void main(String[] args) {
	List<String> names = Arrays.asList("Taj","Sartaz","Rohit","Bishal"); 
	
	Map<String, Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	System.out.println(map);
}
}
