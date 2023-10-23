package cohesion;

public class Overriding {
	public void property() {
		System.out.println("Land, Gold, Cash");
	}
	public void mary() {
		System.out.println("Tajuddin");
	}
}

class C2 extends Overriding{
	public void mary() {
		System.out.println("Soumyajeet");
	}
}
class TestOverriding {
	public static void main(String args[]) {
		Overriding or= new Overriding();
		or.mary();
		C2 c = new C2();
		c.mary();
		Overriding or1 = new Overriding();
		or1.mary();
	}
}