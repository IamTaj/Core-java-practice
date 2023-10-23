package Method_Overloading;
interface Bank{
	void name();
}

interface RBI extends Bank{
	int interest();
}

class SBI implements RBI{
	public void name() {
		System.out.println("RBI");
		
	}
	public int interest() {
		return 0;
	}
	
}

class Axis implements RBI{
	public void name() {
		System.out.println("Axis");
		
	}
	public int interest() {
		return 3;
	}
	
}

class Boi implements RBI{
	public void name() {
		System.out.println("BOI");
		
	}
	public int interest() {
		return 4;
	}
	
}


public class Interface3 {
	public static void main(String arg[]) {
		RBI r = new SBI();
		r.name();
		System.out.println(r.interest());
		
		RBI r1 = new Axis();
		r1.name();
		System.out.println(r1.interest());
		
		RBI r2 = new Boi();
		r2.name();
		System.out.println(r2.interest());
	}
}
