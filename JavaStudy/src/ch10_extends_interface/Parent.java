package ch10_extends_interface;

// JAVA 에선 기본적으로 모든 클래스가 Object 클래스를 상속받고 있음.
public class Parent {
	
	private String name;
	private int age;
	
	public Parent() { 
		// 기본 디폴트 생성자가 있으면 자식 에서 따로 선언을 해주지 않아도 된다.
		// 만약 이 생성자가 없으면 아래와 같은 방식으로 자식에서 선언을 해줘야한다.
		
	}
	
	public Parent(String name, int age) {
	
	// 부모 클래스의 기본 생성자. super();
		super();
		this.name = name;
		this.age = age;
	}

	// 오버라이딩 부모의 toString 메서드를 재 정의해서 사용
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void sayHello() {
		System.out.println("안녕하세요 부모입니다.");
	}
	
	
	
}
