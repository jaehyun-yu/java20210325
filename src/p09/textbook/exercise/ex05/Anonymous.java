package p09.textbook.exercise.ex05;

import p07.textbook.s070704.Vehicle;

public class Anonymous {
	Vehicle field = new vehicle(){
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	}

	public void method1() {
		Vehicle localVar = new Vehicle(){

			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
				localVar.run();
	}

	 void method2(Vehicle v) {
		 v.run();
	 }
		
		
}
