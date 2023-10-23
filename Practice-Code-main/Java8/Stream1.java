package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> n = Arrays.asList(2,3,4,5,6);
		
		List<Integer> sq = n.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(sq);
	}
}
