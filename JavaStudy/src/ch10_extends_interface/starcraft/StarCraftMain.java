package ch10_extends_interface.starcraft;

import java.util.ArrayList;

public class StarCraftMain {
	public static void main(String[] args) {
		Marine marine01 = new Marine("마린", 6, 50, 0);
		Marine marine02 = new Marine();
		
		marine01.move(100, 200);
		marine01.stimpack();
		
		System.out.println(marine01);
		System.out.println(marine02);
		
		Zealot zealot01 = new Zealot();
		zealot01.move(10, 5);
		System.out.println(zealot01);
		
		// 다형성(Polymorphism)
		// 오버라이딩, 오버로딩, 업캐스팅, 다운캐스팅
		// 하나의 객체가 여러 타입을 가질 수 있으며,
		// 자식 객체에서 부모 객체로 형 변환 가능
		StarUnit highTemplar01 = new HihgTemplar();
		HihgTemplar highTemplar02 = new HihgTemplar();
		
		// 자식에서 부모 객체로의 형 변환은 자동으로 됨
		StarUnit highTemplar03 = highTemplar02;
		System.out.println(highTemplar01);
		System.out.println(highTemplar02);
		System.out.println(highTemplar03);
		
		ArrayList<StarUnit> starList = new ArrayList<StarUnit>();
		starList.add(zealot01);
		starList.add(marine01);
		starList.add(marine02); 
		starList.add(highTemplar01);
		starList.add(highTemplar02);
		
		for(int i = 0; i < starList.size(); i++) {
			starList.get(i).move(100, 150);
		}
		System.out.println(starList);
		
		highTemplar02.tthunderStorm();
//		highTemplar03.tthunderStorm(); // 부모로 형 변환 되었기 때문에 사용불가.
		
		StarUnit scv = new StarUnit("SCV", 5, 60, 0);
		System.out.println(scv instanceof Zealot); // 형 변환 가능체크 true/false
		// 부모 객체는 자식 객체로 형 변환할 수 없다.
	}
}
