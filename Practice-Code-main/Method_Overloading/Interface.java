package Method_Overloading;

interface call{
	void print();
}

public class Interface implements call{
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String arg[]) {
		Interface i = new Interface();
		i.print();
	}
}
