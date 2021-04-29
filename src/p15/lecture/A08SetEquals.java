package p15.lecture;

import java.util.HashSet;
import java.util.Set;

public class A08SetEquals {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		Person p1 = new Person();
		p1.setName("trump");
		
		Person p2 = new Person();
		p2.setName("donald");
		
		Person p3 = new Person();
		p3.setName("trump");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		System.out.println(set.size());
	}
}

class Person {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
