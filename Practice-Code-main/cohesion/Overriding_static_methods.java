package cohesion;

class Overriding_static_methods {
	public static void m1() {
		System.out.println("Parent Class");
	}
}
class C extends Overriding_static_methods {
	public void m1()  //Error because static method can't be overridden as non-static 
	{
		System.out.println("Child class");
		
	}
}
