package Java_OOPs;
import java.util.*;
class A{
	int sal = 4000;
	
}
class B extends A{
	static int emp_Id;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empid");
		emp_Id=sc.nextInt();
		B b= new B();
		System.out.println("Salary"+b.sal);
		System.out.println("EMPID"+b.emp_Id);
	}
	
}
	
	

