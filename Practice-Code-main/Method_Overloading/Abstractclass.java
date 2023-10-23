package Method_Overloading;

abstract class Superclass {
	 void display() {
		System.out.println("Super class method");
	}
	
}
class Child extends Superclass{
	public void display() {
		System.out.println("Subclass method");
	}
}

public class Abstractclass {
	public static void main(String args[]) {
		Child c =new Child();
		c.display();
		//c.display1();
	}

}
