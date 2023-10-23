package Java8;
import java.util.*;
import java.util.stream.Collectors;



public class Cities {
	String name;
	double temp;
	public Cities(String name, double temp) {
		this.name=name;
		this.temp=temp;
	}
	
	public String getName() {
		return name;
	}
	public Double getTemp() {
		return temp;
	}
	public String toString() {
		return name+" -->  "+temp;
	}
	public static void main(String[] args) {
		System.out.println(prepareTemperature().stream().filter(f -> f.getTemp() >10 ).map(f -> f.getName()).collect(Collectors.toList()));
		
	}
	private static List<Cities> prepareTemperature(){
		List<Cities> val  = new ArrayList<>();
		val.add(new Cities("New Delhi",33.54));
		val.add(new Cities("Capetown",21.54));
		val.add(new Cities("Dubai",31.54));
		val.add(new Cities("New Jersey",39.54));
		return val;
		
	}
}
