package Method_Overloading;
import java.util.*;
import Method_Overloading.Encapsulation;
public class TestEncap {
	public static void main(String arg[]){
		Encapsulation e = new Encapsulation();
		e.setName("Taj");
		e.setAccNo(129746323);
		e.setBal(28783.90f);
		
		System.out.println(e.getAccNo());
		System.out.println(e.getBal());
		System.out.println(e.getName());
		
	}

}
