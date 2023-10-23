package Method_Overloading;

public class DynamicBind {
	public class Superclass{
		public void display() {
			System.out.println("print() of parent class is called");
		}
	}
	public class Subclass extends Superclass{
		public void display() {
			System.out.println("print() of child class is called");
		}
	}
	public static void main() {
		DynamicBind d = new DynamicBind();
		Superclass s1 = d.new Superclass();
		Superclass s2 = d.new Subclass();
		s1.display();
		s2.display();
	}
	
}
