package Java8;

public class Functionalinterface2 {
	public static void main(String[] args) {
		new Thread (()->{
			System.out.println("Enter a new thread");
		}).start();
	}

}
