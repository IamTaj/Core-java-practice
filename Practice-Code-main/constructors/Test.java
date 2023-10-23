package constructors;

public class Test {

	int id;
	String name;
	float sal;

	Test() {

		id = 10;
		name = "Ali";
		sal = 29000;

	}

	void display() {
		System.out.println("Details");
		System.out.println("id" + id);
		System.out.println("name" + name);
		System.out.println("sal" + sal);
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.display();
		Test t2 = new Test();
		t2.display();
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}
