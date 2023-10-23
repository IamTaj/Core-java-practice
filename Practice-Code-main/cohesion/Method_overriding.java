package cohesion;

class Method_overriding {
	public static  void m1() {
		System.out.println("Parent Method");
	}
}
class C1 extends Method_overriding {
	public static void m1() {
		System.out.println("Child Method");
	}
}
class Test1 {
	public static void main(String args[]) { 
		Method_overriding mr = new Method_overriding();
		mr.m1();
		C1 c = new C1();
		c.m1();
		Method_overriding mr1 = new Method_overriding();
		mr1.m1();
	}
}