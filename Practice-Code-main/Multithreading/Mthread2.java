package Multithreading;
import java.lang.*;

class Demo{
	public void run() {
		System.out.println("The Parent class method is being executed");
	}
}

public class Mthread2 extends Demo implements Runnable{
	public void run() {
		System.out.println("The child classs method is being executed");
	}
	public static void main(String arg[]) {
		Mthread2 mt = new Mthread2();
		mt.run();
		Thread t = new Thread();
		t.start();
		System.out.println("The main method");
	}
}
