package p09.textbook.exercise.ex04;

import p09.textbook.exercise.ex04.Car.Tire;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine(); 
	}
}
