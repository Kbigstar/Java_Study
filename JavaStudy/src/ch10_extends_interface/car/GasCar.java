package ch10_extends_interface.car;

public class GasCar implements Vehicle {

	@Override
	public void start() {
		System.out.println("부릉 부르릉");

	}

	@Override
	public void stop() {
		System.out.println("...탈..탈.탈..");

	}

}
