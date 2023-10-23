package Enum;
import java.util.*;

enum Planet{
	MERCURY,
	VENUS,
	EARTH,
	MARS,
	JUPITER,
	SATURN,
	URANUS,
	NEPTUNE;
}

public class Planets {
	public static void main(String[] args) {
		Planet p[] = Planet.values();
		for(Planet val : p) {
			System.out.println(val+"\t is "+(val.ordinal()+1)+" planet.");
			
		}
		System.out.println(Planet.valueOf("EARTH"));
	}

}
