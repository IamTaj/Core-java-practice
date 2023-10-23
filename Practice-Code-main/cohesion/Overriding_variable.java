package cohesion;

class Overriding_variable {
	int i = 888;
}
class C extends Overriding_variable{
	int i =999;
}
class Test{
	public static void main(String args[]) {
		
		Overriding_variable orv = new Overriding_variable();
		System.out.println(orv.i);
		C c = new C();
		System.out.println(c.i);
		Overriding_variable a = new C();
		System.out.println(a.i);
	}
}
