package Method_Overloading;
interface draw{
	void draw();
}

class Circle implements draw{
	public void draw() {
		System.out.println("Drawing circle");
	}
}
class Rectangle implements draw{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}
public class InterfaceTest2 {
	public static void main(String args[]) {
		draw d = new Circle();
		d.draw();
		
		draw d1 = new Rectangle();
		d1.draw();
	}
}
