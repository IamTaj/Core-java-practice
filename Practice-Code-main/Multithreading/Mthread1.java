package Multithreading;
import java.lang.*;

public class Mthread1 extends Thread {
 public void run() {
	 System.out.println("Run method is running");
 }
 public static void main(String arg[]) {
	 Mthread1 mt = new Mthread1();
	 mt.start();
	 System.out.println("The main method is running");
 }
}
