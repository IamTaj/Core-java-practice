package Java_OOPs;

public class con_overload {
	private String name;
	private int emp_id;
	
	public con_overload() {
		this.name="Default Name";
	}
	
	public con_overload(String nm) {
		this.name=nm;
		
	}
	public String getName() {
		return name;
	}
	
	public con_overload(String nm, int empid) {
		this.name=nm;
		this.emp_id=empid;
	}
	public int getId(int id) {
		return emp_id;
	}
	
	public String toString() {
		return "Name = "+ name +"\t ID = "+ emp_id; 
	}
	
	public static void main(String arg[]) {
		con_overload o = new con_overload();
		System.out.println(o);
		o = new con_overload("Taj");
		System.out.println(o);
		o = new con_overload("Sk Tajuddin Ali",2060);
		System.out.println(o);
		
		//o= new 
		
	}
}
