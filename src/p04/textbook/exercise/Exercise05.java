package p04.textbook.exercise;

public class Exercise05 {

	public static void main(String[] args) {
		int x =0;
		int y =0;
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				x=i;
				y=j;
				if ((4*i) + (5*j) == 60) {
				System.out.println( "(" + i + "," + j + ")"  );
			}
			}
		}

	}

}
