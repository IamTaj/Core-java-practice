package Java8;

interface Convert{
	String con(String str);
}

class Convertstring{
	public String convert(String s) {
		if(s.length()<=4) {
			s= s.toUpperCase();
			
		}
		else {
			s= s.toLowerCase();
		}
		return s;
	}
}

class Pointer{
	public void print(String s, Convertstring p) {
		s = p.convert(s);
		System.out.println(s);
	}
}
public class MethodReference2 {
	public static void main(String[] args) {
		Convertstring sp = new Convertstring();
		String str= "Taj";
		Pointer p = new Pointer();
//		p.print(str,(Convertstring::convert));
	}
}
