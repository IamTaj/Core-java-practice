package Java_OOPs;

public class method_overload {
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String arg[])
	{
		method_overload mo = new method_overload();
		int a=mo.add(2, 5);
		int b=mo.add(76, 99, 78);
		System.out.println(a);
		System.out.println(b);
		
	}
}
