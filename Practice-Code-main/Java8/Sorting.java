package Java8;
import java.util.*;

public class Sorting {
	public static void main(String[] args) {
		int num[] = {32,45,32,53,123,12,765,21,1,4,10};
		Arrays.stream(num).forEach(n -> {System.out.println(n);});
	
		Arrays.parallelSort(num);
		System.out.println("Sorted");
		Arrays.stream(num).forEach(n ->{System.out.println(n);});
	}

}
