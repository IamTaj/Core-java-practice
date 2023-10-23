package Enum;
import java.util.*;

enum Desig{
	FRONTEND,
	BACKEND,
	FULLSTACK,
	CLOUD_COMPUTING,
	AI_ML;
	Desig() {
		System.out.println("The Available Courses are ="+this.toString());
		
	}
}
public class Course {
	public static void main(String arg[]) {
		
		Desig d1 = Desig.AI_ML;
		System.out.println(d1);
	}

}
