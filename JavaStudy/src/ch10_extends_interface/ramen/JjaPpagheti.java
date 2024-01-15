package ch10_extends_interface.ramen;

public class JjaPpagheti extends Ramen{

	public JjaPpagheti(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printRecipe() {
		
		System.out.println("끓는 물에 면을 삶은 후 물은 버리고 스프를 비벼드세요");
		System.out.println("꾸덕한걸 좋아하시면 스프를 비빌때는 불을 끄고 하셔요");
		System.out.println("부드러운걸 좋아하시면 스프를 비빌때 불을 약하게 키고 하셔요");
		
	}

}
