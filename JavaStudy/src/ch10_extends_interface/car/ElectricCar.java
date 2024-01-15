package ch10_extends_interface.car;

public class ElectricCar implements Vehicle {

	@Override
	public void start() {

		System.out.println("슈우웅~~~~");
		
	}

	@Override
	public void stop() {

		System.out.println("으응---");
		
	}

}
