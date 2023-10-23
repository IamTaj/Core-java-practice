package IOFiles;
import java.util.*;
import java.io.*;

public class Getfileinfo {
	public static void main(String[] args) {
		File myfile = new File("myfile1.txt") ;
		if(myfile.exists()) {
			System.out.println("File name : "+myfile.getName());
			System.out.println("File Path : "+myfile.getAbsolutePath());
			System.out.println("File Size : "+myfile.length());
			System.out.println("File Readable : "+myfile.canRead());
			System.out.println("File Writeable : "+myfile.canWrite());
			
		}
		else {
			System.out.println("File not found !");
		}
	}
}
