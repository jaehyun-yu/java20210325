package p04.textbook.exercise;

public class Exercise04 {

	public static void main(String[] args) {
		
		int sum = 0;
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + num + "," + num2 + ")");
				
			sum= num + num2;
			if(sum == 5) {
		System.out.println("합이 5입니다");
		break;
		}else if(sum != 5) {
			System.out.println("합이 5가 아닙니다 다시 던져주세요");
	}
		
	}
		

	}

}
