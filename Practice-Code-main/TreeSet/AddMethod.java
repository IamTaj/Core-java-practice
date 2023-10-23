package TreeSet;
import java.util.*;
import java.util.*;

class Emp{
	Set <Integer> empset = new TreeSet<>();
	Set<Integer> details1(){
		
		empset.add(1234);
		empset.add(1235);
		empset.add(1236);
		empset.add(1237);
		empset.add(1238);
		return empset;
	}
}

public class AddMethod extends Emp{
	
	
	
	public static void main(String arg[]) {
		TreeSet <Integer> ts = new TreeSet<Integer>();
		//TreeSet ts = new TreeSet();
		ts.add(2060);
		ts.add(2061);
		ts.add(2061);
		ts.add(2062);
		Emp e1 = new Emp();
		e1.details1();
		ts.addAll(e1.empset);
		//System.out.println(ts);
		
		int count=0;
		//System.out.println(ts);
		
		int ceil =0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the emp id");
			int id= sc.nextInt();
			Boolean check;
			check=ts.contains(id);
//			for(Integer val : ts) {
//				if (val==id) {
//					count++;
//				}
//			}
				if(check==true) {
				
				System.out.println("Valid employee");
				}
				else {
					ceil=ts.ceiling(id);
					System.out.println("Not a valid employee ");
					System.out.println("Nearest Valid employee "+ceil);
				
			}
		
	}
		catch(Exception e) {
			
			System.out.println("Enter a valid Employee id "+e.getMessage());
		}
		System.out.println(ts.descendingSet());
		Comparator comp = ts.comparator();
		System.out.println(comp);
		
		TreeSet clone = new TreeSet();
		clone = (TreeSet) ts.clone();
		System.out.println(clone);
		
		System.out.println(ts.higher(2060));
		
	
		System.out.println(ts.lower(2064));
		
		System.out.println(ts.higher(2060));
		ts.pollFirst();
		System.out.println(ts);
		ts.pollLast();
		System.out.println(ts);
		
		Iterator i = ts.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
		System.out.println(ts.subSet(1238, 2062));
		System.out.println(ts.tailSet(1238));
	}
}
