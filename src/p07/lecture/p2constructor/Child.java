package p07.lecture.p2constructor;

public class Child extends Parent {
	private int j;
		
//	public Child() {
//		super();
//	}
	
	public Child(int i, int j ) {
		super(i);
		this.j = j;
	}
}