package Java8;
import java.util.*;

public class Stream3 {
public static void main(String[] args) {
	List<Integer> n = Arrays.asList(2,3,4,5,6,7,8,9,10);
	
	n.stream().map(x -> x*x).forEach(y -> System.out.println(y));
	n.stream().map(x -> x).forEach(y -> System.out.println(y));
	
	int even = n.stream().filter(x ->x%2==0).reduce(0, (ans,i) ->ans+1);
	System.out.println("The ans "+even);
}
}
