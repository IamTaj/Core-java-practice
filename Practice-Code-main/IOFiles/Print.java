package IOFiles;
import java.io.*;

public class Print {
	public static void main(String[] args) {
		System.err.println("This is a Error line");
		try {
			System.out.println("Enter a val");
			int n =System.in.read();
			System.out.println(n);
			
			int m =System.in.read();
			System.out.println((char)m);
		}
		catch(IOException e) {
			System.out.println("Exception Occured");
		}
	}

}
