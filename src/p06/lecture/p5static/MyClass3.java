package p06.lecture.p5static;

public class MyClass3 {
	static void method1() {
		System.out.println("method1()");
	}
	static void method3() {
		System.out.println("method3()");
	}
	
	void method2() {
		System.out.println("method2()");
		this.method4();
	}
	void method4() {
		System.out.println("method4()");
	}
}
