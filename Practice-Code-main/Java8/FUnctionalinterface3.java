package Java8;

interface square{
	int cal(int x);
}

public class FUnctionalinterface3 {
public static void main(String[] args) {
	int a=5;
	
	square s = (int x) ->x*x;
	int asns = s.cal(a);
	System.out.println(asns);
}
}
