package Method_Overloading;
abstract class Square{
	abstract int sides();
	int l=200;
	int b=100;
}
class Abstract1 extends Square{
	public static void main(String arg[]) {
		Abstract1 s=new Abstract1();
		System.out.println(s.sides());
	}
	int sides() {
		l=2;
		int ar=l*l;
		return ar;
		
		
	}

}
