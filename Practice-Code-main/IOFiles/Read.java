package IOFiles;
import java.io.*;
import java.util.*;

public class Read {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\d1\\eclipse-workspace\\cohesion\\myfile1.txt");
			if(f.exists()) {
				System.out.println("File Existed\n\n");
				}
			Scanner sc = new Scanner(f);
			while(sc.hasNext()) {
				String lines= sc.nextLine();
				System.out.println(lines);
				}
			sc.close();
			}
		catch(FileNotFoundException e) {
			System.out.println("Sorry you may have written a wrong Filename or the file doesn't exist");
			}
	}

}
