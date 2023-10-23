package Java_OOPs;

class Inheritance1{
public void dog() {
	System.out.println("This is a Single Inheritance");
	
}
}
class CAT extends Inheritance1{
	public void cat() {
		System.out.println("Cat");
	}
}
class Inheritance{
public static void main(String arg[]) {
	CAT d = new CAT();
	d.dog();
	d.cat();
}
}
