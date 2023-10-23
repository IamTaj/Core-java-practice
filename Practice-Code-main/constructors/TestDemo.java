package constructors;

public class TestDemo {

	int eid;
	String ename; 
	
	TestDemo(int eid,String ename){
		this.eid = eid; 
		this.ename = ename; 
		
	}
	
	void display() {
		System.out.println("Employee details");
		System.out.println(eid);
		System.out.println(ename);
	}
	
	public static void main(String[] args) {
		
		TestDemo td = new TestDemo(1, "prashanth"); 
		td.display();
		Test t = new Test(); 
		System.out.println(t.toString());
		
		
		
	
		
		
	}
	
	
}
