package Java_OOPs;

public class Demo {

	public static void main(String[] args) {
 

		Child c = new Child();
		c.marry();

		Parent p1 = new Child();
		p1.marry1();

	}

}

class Child extends Parent {

	void marry() {
		System.out.println("Surendra");
	}

	void marry1() {
		System.out.println("Surendra");
	}

}

class Parent {

	void marry1() {
		System.out.println("Narendra");
	}

}
