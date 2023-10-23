package IOFiles;
import java.io.*;

public class Deletefile {
	 public static void main(String[] args)throws IOException {
		File f = new File("text1.txt");
		//File f = new File("demo1");
	FileWriter f1=new FileWriter(f);
	f1.write("i am a student ");
	f1.close();
		
	File f2 = new File("text1.txt");
		f2.delete();
		
	
	}
}
