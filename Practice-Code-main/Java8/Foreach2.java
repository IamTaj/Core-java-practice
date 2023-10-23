package Java8;
import java.util.*;
import java.io.*;

public class Foreach2 {
	public static void main(String[] args) {
	ArrayList<Integer> ar = new ArrayList<>();
	
	ar.add(89);
	ar.add(43);
	ar.add(79);
	ar.add(45);
	
	ar.forEach(roll -> {if(roll>70) {
		System.out.println(roll);
	}});
	}
}
