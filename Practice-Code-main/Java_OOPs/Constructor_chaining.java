package Java_OOPs;

public class Constructor_chaining {
private String empname;
private int empid;

public Constructor_chaining() {
	this("Sk Tajuddin Ali", 007);
	System.out.println("Default Employee ceated");
}
public Constructor_chaining(String name,int id) {
	this.empname=name;
	this.empid=id;
	System.out.println("Employee Created");
}
public Constructor_chaining(int id) {
	this("Sk Tajuddin Ali",id);
	System.out.println("Employee Ceated With Default Name");
	
}
public static void main(String args[]) {
	Constructor_chaining c = new Constructor_chaining();
	System.out.println(c);
	
	c = new Constructor_chaining(92);
	System.out.println(c);
	
	c= new Constructor_chaining("Taj",2060);
	System.out.println(c);
	
}


public String toString() {
	return "NAME ="+ empname+"\tID="+empid;
}
public String getName() {
	return empname;
}
public void setName(String name) {
	this.empname=name;
}
public int getId() {
	return empid;
	
}

public void setId(int id) {
	this.empid=id;
}
}
