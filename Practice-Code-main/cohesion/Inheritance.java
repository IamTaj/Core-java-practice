package cohesion;

public class Inheritance {
		int a = 2;
}
 class Child extends Inheritance{
			int b =3;
		public static void main(String args[]) {
			Child c = new Child();
			int sum = c.b+c.a;
			System.out.println(sum);
			
		}
	}
