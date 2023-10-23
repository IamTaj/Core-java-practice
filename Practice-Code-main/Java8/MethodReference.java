package Java8;

interface NullVoid{
	void say();
}
public class MethodReference {
	public static void saySomething() {
		System.out.println("This is a static method");
		
	}
	public static void main(String arg[]) {
		NullVoid nv = MethodReference::saySomething;
		nv.say();
	}
}
