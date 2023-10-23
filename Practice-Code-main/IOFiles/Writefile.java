package IOFiles;
import java.io.*;


public class Writefile {
	public static void main(String[] args) {
		try {
			FileWriter myfile = new FileWriter("C:\\Users\\d1\\eclipse-workspace\\cohesion\\myfile1.txt");
			myfile.write("Now I'm shaking, drinking all this coffee\r\n"
					+ "These last few weeks have been exhausting\r\n"
					+ "I'm lost in my imagination\r\n"
					+ "And there's one thing that I need from you\r\n"
					+ "Can you come through, through?\r\n"
					+ "Through, yeah\r\n"
					+ "And there's one thing that I need from you\r\n"
					+ "Can you come through?");
			
			myfile.close();
			System.out.println("File is been updated !");
		}
		catch(IOException e) {
			System.out.println("Error !");
			e.printStackTrace();
		}
		
		
	}
}
