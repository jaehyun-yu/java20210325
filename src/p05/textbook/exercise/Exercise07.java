package p05.textbook.exercise;

import java.util.Arrays;

public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		
		int[] array = {1,5,3,8,2};
		Arrays.sort(array);
		
		for(int i = 0; i< array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			
			}
		}
		int sum= 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + array[0]);
		System.out.println("sum : " + sum);
		double avg = (double) sum /5;
		System.out.println("avg : " + avg);

	}

}
