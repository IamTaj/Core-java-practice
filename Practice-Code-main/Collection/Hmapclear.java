package Collection;
import java.util.*;

public class Hmapclear extends Hmapdeclare{
	public static void main(String arg[]) {
		Hmapdeclare y = new Hmapdeclare();
		HashMap <Integer,String> map1 = new HashMap <Integer,String> ();
		y.m();
		System.out.println(y.h);
		
		//Clone() 
		map1 =(HashMap) y.h.clone();
		
		//Clear()
		y.h.clear();
		System.out.println(y.h);
		System.out.println(y.h.isEmpty());
		System.out.println(map1);
		
		
		//entrySet()
		for(Map.Entry m : map1.entrySet()) {
			
			//getKey() and getValue()
			System.out.println(m.getKey()+"  "+m.getValue());
			
		}
	}
	

}
