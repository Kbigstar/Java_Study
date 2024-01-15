package ch10_extends_interface.ramen;

// 추상 클래스
// 자체적으로 생성하지는 못함, 상속을 통해서만 가능하다.
// 추상 클래스는 기본적인 구조를 정의함
public abstract class Ramen {

	String name;
	int price;
	
	public Ramen(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// input, output, name만 정의 {}(기능) <- 없음
	public abstract void printRecipe();
	
	public void test() {
		System.out.println("test");
	}
	
}
