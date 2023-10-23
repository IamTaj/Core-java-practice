package cohesion;

import java.util.*;

public class Random {

	private int nextInt() {
		return 0;
	}

	public static void main(String agr[]) {
		Random r = new Random();
		int num = r.nextInt();
		if (num > 0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
			}
	}

}
