package Java_OOPs;
import java.util.*;
public class method_overload3 {
	public void sum(int a,int b) {
		System.out.println("Integer arg invoked");
	}
	public void sum(long a, long b) {
		System.out.println("Long arg invoked");
	}
	public static void main(String arg[]) {
		method_overload3 o= new method_overload3();
		o.sum(22, 67);
	}
	
}
