package p04.lecture;

import java.util.Scanner;

public class A13ForGCD {

	public static void main(String[] args) {
		// 최대공약수 : greatest common divisor
		// 두수의 약수중 큰것
		
		Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int d= num1; d>=1; d--) {
        	if ((num1 % d ) == 0 && (num2 % d ) == 0) {
        		System.out.println("최대공약수는:" + d);
        		break;
        	}
        }
		

	}

}
