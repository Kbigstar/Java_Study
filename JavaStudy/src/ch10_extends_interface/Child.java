package ch10_extends_interface;

public class Child extends Parent{

	public Child() {
		super();
	}
	
	public Child(String name, int age) {
		super(name, age);
	}
	

	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void sayHello() {
		System.out.println("안녕하세요 자식입니다.");
	}
	
}
