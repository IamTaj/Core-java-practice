package ExceptionHandling;

import java.io.*;

public class CheckedException {
	
	public static void m()throws FileNotFoundException{
		FileReader f = new FileReader("C:\\Users\\Anurati\\Desktop\\.txt");
		BufferedReader filei= new BufferedReader(f);
		
		throw new FileNotFoundException();
	}
	
public static void main(String arg[]) {
	try {
		m();
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("Hello");
}

}
