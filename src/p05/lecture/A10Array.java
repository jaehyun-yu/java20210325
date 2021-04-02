package p05.lecture;

public class A10Array {
			//그림 06.배열.png
	public static void main(String[] args) {
//		array(배열) : 여러개의 값을 갖는 자료형
		
		int i;
		i = 5;
		
		int[] arr;
		arr = new int[3];
		
		arr[0] = 5;
		arr[1] = 7;
		
		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(i));
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

	}

}
