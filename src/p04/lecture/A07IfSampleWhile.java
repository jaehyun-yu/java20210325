package p04.lecture;

import java.util.Scanner;

public class A07IfSampleWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int count=1;
		
		int dice = (int) (Math.random() * 6) + 1;
		
		for( a =1; a<1000; count++) {
			System.out.println("주사위의 수를 맞춰보세요>");
			int user = scanner.nextInt();
			
			if (user == dice) {
				System.out.println(count + "번만에 맞췄습니다.");
				break;
				
			}else {
				System.out.println("다시 시도해보세요.");
				
		}
			
		}
	}
}