package cohesion;

public class Ambiguity_overload {
	public void m1(String s) {
		System.out.println("String version");
	}
	public void m1(Object o) {
		System.out.println("Obejct verion");
	}
	public static void main(String arg[]) {
		Ambiguity_overload ao = new Ambiguity_overload();
		ao.m1("taju");
		ao.m1(new Object());
		ao.m1(null);
	}
}
