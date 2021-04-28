package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A17ThrowPolymorphism {
	public static void main(String[] args) {
		method1();
	}
	private static void method1() throws ClassNotFoundException, FileNotFoundException {
		Class.forName("java.lang.String");
		FileInputStream file = new FileInputStream("");
	}
}
