package p13.lecture;

public class A03Generic {
	public static void main(String[] args) {
		
		Generic3<String> g3 = new Generic3<>();
		g3.set0("java");
		String s = g3.get0();
		System.out.println(s);
		
		Generic3<Integer> g4 = new Generic3<>();
   }
}


class Generic3<T> {
	private T o;
	
	public T get0() {
		return o;
	}
	public void set0(T o) {
		this.o = o;
	}
}
