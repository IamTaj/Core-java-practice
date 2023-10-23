package Java_OOPs;
class Animal{
	String c="white";
}
class Dog extends Animal{
	String c="Black";
//}
//class Cat extends Dog{
	//String c="Orange";
	void print() {
		System.out.println(c);
		System.out.println(super.c);
	}
}

class Subject {
	public static void main(String args[]) {
		Dog d= new Dog();
		d.print();
	}

}
