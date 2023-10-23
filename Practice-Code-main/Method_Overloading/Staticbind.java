package Method_Overloading;

public class Staticbind {

	public class super_class{
		static void display() {
			System.out.println("Print() of super class is called");
		}
	}
	public class sub_class extends super_class{
		static void display() {
			System.out.println("Print() of child class is called");
		}
		
	}
	public static void main(String arg[]) {
		Staticbind s = new Staticbind();
		super_class  s1 = s.new super_class();
		sub_class s2 = s.new sub_class();
		s1.display();
		s2.display();
	}
}
