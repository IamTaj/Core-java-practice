package Collection;
import java.util.*;

public class ListIterator {
	public static void main(String str[]) {
		ArrayList<String> arrlist = new ArrayList<String>();  
		arrlist.add("d");  
		arrlist.add("dd");  
		arrlist.add("ddd");  
		arrlist.add("dddd");  
		arrlist.add("ddddd");  
		System.out.println(arrlist);    // [d, dd, ddd, dddd, ddddd]  
		  
	    Iterator<String> iterator = arrlist.listIterator(2);  
		while (iterator.hasNext())  
		{  
		String i = iterator.next();  
		System.out.println(i);  
	}
}
}
