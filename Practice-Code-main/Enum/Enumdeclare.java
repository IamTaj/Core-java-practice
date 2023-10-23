package Enum;

enum Month{
	JAN,
	FEB,
	MAR,
	APR,
	MAY,
	JUN,
	JUL,
	AUG,
	SEP,
	OCT,
	NOV,
	DEC;
	
	//private Month() {
		//System.out.println("Constructor called for ="+this.toString());
	//}
}

public class Enumdeclare {
	public static void main(String arg[]) {
		Month m = Month.AUG;
		
		System.out.println(m);
		
	}

}
