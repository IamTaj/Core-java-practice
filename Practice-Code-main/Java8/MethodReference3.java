package Java8;

import java.io.*;
import java.util.*;

class Person{
	private String name;
	private int id;
	
	Person(String name, int id){
		this.name=name;
		this.id=id;
		
	}
	public Integer getid() {
		return id;
	}
	public String getname() {
		return name;
	}
}

public class MethodReference3 {
	public static int compareById(Person a, Person b) {
		return a.getid().compareTo(b.getid());
	}
	public static int comapreByName(Person a, Person b) {
		return a.getname().compareTo(b.getname());
	}
	public static void main(String arg[]) {
		List<Person> plist = new ArrayList<>();
		
		plist.add(new Person("Taj",81));
		plist.add(new Person("Sonu",81));
		plist.add(new Person("Jaiswal",76));
		
		Collections.sort(plist, MethodReference3::compareById );
		
		plist.stream().map(x-> x.getid()).forEach(System.out::println);
		
		
		
	}
}
