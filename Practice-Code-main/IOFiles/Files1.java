package IOFiles;
import java.io.*;

public class Files1 {
	public static void main(String[] args) {
		try {
		File obj = new File("myfile1.txt");
		if(obj.createNewFile()) {
			System.out.println("New File Created");
				
		}
		if(obj.exists()) {
			System.out.println("The file is exist "+obj.getName());
		}

		
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}
}
