package Java8;

public class Lamdatwoexpression {
	interface Fun1 {
		int operation(int a, int b);
	}
	
	interface Fun2 {
		void SayMessage(String m);
	}
	private int operate(int a, int b, Fun1 f) {
		return f.operation(a, b);
	}
	public static void main(String[] args) {
		Fun1 add =(int x, int y) -> x+ y;
		Fun1 sub =(int x, int y) -> x-y;
		
		Lamdatwoexpression lo = new Lamdatwoexpression();
		
		System.out.println("Addition is "+lo.operate(43,23, sub));
		System.out.println("Multiply is "+lo.operate(12,43,sub));
		
		Fun2 objFun2 = m -> System.out.println("End of "+m);
		objFun2.SayMessage("Nigga");
	}
}
