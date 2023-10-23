package IOFiles;
import java.io.*;
import java.util.*;

public class Append {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path;
		try {
		File f = new File("C:\\Users\\d1\\eclipse-workspace\\cohesion\\src\\IOFiles\\demo1.java");
		
		FileWriter fr = new FileWriter(f, true);
		//BufferedWriter br = new BufferedWriter(fr);
		//fr.write("Appends");
		
		//br.write("Buffered");


		//br.close();
		
		
		System.out.println("Appends done");
		}
		catch(IOException e){
			System.out.println("sorry");
		}
	}
}
