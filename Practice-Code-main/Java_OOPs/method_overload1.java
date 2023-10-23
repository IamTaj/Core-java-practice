package Java_OOPs;

public class method_overload1 {
	public int ans(int a, int b) {
		return a+b;
	}
	public float ans(float a, float b) {
		return a+b;
	}
	public double ans(double a, double b) {
		return a+b;
	}
	public static void main(String arg[]) {
		method_overload1 m=new method_overload1();
		System.out.println(m.ans(23, 89));
		System.out.println(m.ans(2.380f, 89.763f));
		System.out.println(m.ans(23.327921d, 89.7832d));
	}
}
