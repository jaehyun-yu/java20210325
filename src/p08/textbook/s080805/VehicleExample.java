package p08.textbook.s080805;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); (x)
		
		Bus bus = (Bus) vehicle;  //강제 타입변환
		
		bus.run();
		bus.checkFare();
	}
}
