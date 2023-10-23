package Method_Overloading;

public class This {
private int id;
private String name;
private int phone;

public int getId(int empId) {
	this.id=empId;
	return empId;
}
public int getPhone(int number) {
	this.phone=number;
	return number;

}
public String getName(String n) {
	this.name=n;
	return n;
}
public static void main(String arg[]) {
	This i =new This();
	int n1=i.getId(123);
	String n2= i.getName("Taj");
	int n3 = i.getPhone(12345);
	System.out.println("Name ="+n2+"\t ID ="+n1+"\t Number ="+n3);
}
}
