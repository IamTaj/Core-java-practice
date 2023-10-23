package cohesion;

public class employee {
	
	String name;
	public String getName(String name) {
		this.name = name;
		return name;
	}
}
class Age{
	int age;
	public int getAge(int age) {
		this.age = age;
		return age;
	}
}
class Number{
	int phoneNumber;
	public int getNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
		return phoneNumber;
	}
}

class Display{
	public static void main(String args[]) {
		employee e = new employee();
		Age a = new Age(); 
		Number n = new Number();
		
		System.out.println(e.getName("Taj"));
		System.out.println(a.getAge(22));
		System.out.println(n.getNumber(989898989));
	}
}