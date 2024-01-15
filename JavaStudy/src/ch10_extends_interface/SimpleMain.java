package ch10_extends_interface;

public class SimpleMain {

	
	public static void main(String[] args) {
		Parent papa = new Parent("팽수아빠", 60);
		System.out.println(papa.getName());
		papa.sayHello();
		
		Child baby = new Child("팽수", 10); // Child Class 에는 name 필드가 없음.
		System.out.println(baby.getName());
		baby.sayHello();
		
		
	}
	
	
	
}
