package p03.textbook;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++; //10
		++x; //12
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		y--; //10
		--y; //8
		System.out.println("y=" + y);
		
		System.out.println("------------------");
		z = x++; //12 
		        //x = 13
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		
		z= ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y" + y);

	}

}
