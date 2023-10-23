package Java8;


interface Add{
	void addfun(int x);


}
public class Lamdap1 {
	public static void main(String[] args) {
		Add a = (int x) -> System.out.println(23*x);
		
		
		a.addfun(5);
	}

}
