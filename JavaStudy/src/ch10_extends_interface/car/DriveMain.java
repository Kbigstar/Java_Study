package ch10_extends_interface.car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DriveMain {
	

	public static void main(String[] args) {
	
		Vehicle car1 = new ElectricCar();
		Vehicle car2 = new GasCar();
		
		car1.start();
		car2.start();
		
		//동일한 Vehicle 이라는 인터페이스를 구현한 클래스 이므로 동일한 메서드가 있음.
		ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
		cars.add(car1);
		cars.add(car2);
		
		//동일한 인터페이스로 구현되어 제너릭이 같은 타입으로 사용가능 하다.
		cars.get(0).stop();
		cars.get(1).stop();
		
		List list = new ArrayList<>();
		List list2 = new LinkedList<>();
		list.add("hi");
		list2.add("hi");
		
	}
	
	
}
