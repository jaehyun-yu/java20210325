package p04.textbook;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// 2단 ~ 9단
		for (int m =2; m <=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n = 1; n<=9; n++) {
				System.out.println(m + "x " + n + " = " + (m * n));
			}
		}
		System.out.println("----------------");
		// 2단 ~ 9단 짝수단
		for (int m =2; m <=9; m=m+2) {
			System.out.println("*** " + m + "단 ***");
			for(int n = 1; n<=9; n++) {
				System.out.println(m + "x " + n + " = " + (m * n));
			}
		}
		System.out.println("----------------");
		// 2단 ~ 9단 *짝수
		for (int m =2; m <=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n = 2; n<=9; n=n+2) {
				System.out.println(m + "x " + n + " = " + (m * n));
			}
		}
		System.out.println("----------------");
		//9단 ~ 2단 9x1부터
		for (int m=9; m>=2; m--) {
			System.out.println("***" + m + "단 ***");
			for(int n = 1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
			}
		}
		
		System.out.println("----------------");
		//9단 ~ 2단 9x9부터
		for (int m=9; m>=2; m--) {
			System.out.println("***" + m + "단 ***");
			for(int n = 9; n>=1; n--) {
				System.out.println(m + "x" + n + "=" + (m * n));
			}
		}
	}

}
