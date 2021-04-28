package p13.textbook.exericses.ex02;

public class Container<T> {
	private T field;
	
	public void set(T field) {
		this.field = field;
	}
	
	public T get() {
		return field;
	}
}
