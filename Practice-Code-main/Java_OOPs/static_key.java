package Java_OOPs;

class static_key1 {
String name;
int roll;
static String clg = "ITER";

static_key1(String ne, int rl){
	name=ne;
	roll=rl;
}
public void display() {
	System.out.println("NAME = "+name+"Roll ="+"College ="+clg);
	}
}

public class static_key{
	public static void main(String args[]) {
		static_key1 s= new static_key1("Taj",22);
		static_key1 s1= new static_key1("Taju",12);
		s.display();
		s1.display();
		
	}
	
}

