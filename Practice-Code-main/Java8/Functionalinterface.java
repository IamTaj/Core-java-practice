package Java8;

public class Functionalinterface {
public static void main(String[] args) {
	new Thread(new Runnable() {
		public void run() {
			
		
		System.out.println("New Thread created");
		}
		}).start();
}
}
