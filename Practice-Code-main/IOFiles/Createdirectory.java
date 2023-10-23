package IOFiles;
import java.io.*;
import java.util.*;

public class Createdirectory {
	public static void main(String[] args) {
			try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the directory name :");
			String path =sc.next();
			
			
			System.out.println("Enter the file name");
			path=path+"\\"+sc.next();
			
			File myfile = new File("C:\\Users\\d1\\eclipse-workspace\\cohesion\\src\\"+path);
			if(myfile.createNewFile()) {
				System.out.println("Directory created and file created");
			}
			else {
				System.out.println("Failed ");
			}
			}catch(IOException e) {
				System.out.println("Error");
			}
			
		
}
}
