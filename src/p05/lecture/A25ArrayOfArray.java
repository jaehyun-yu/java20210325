package p05.lecture;

import java.util.Arrays;

public class A25ArrayOfArray {
		//그림 9번
	public static void main(String[] args) {
		int[][]arr = new int[2][3];
		arr[1][1] = 9;
		arr[0][2] = 8;
		
		for(int[] elem : arr) {
			System.out.println(Arrays.toString(elem));
		}
	}

}