package ch10_extends_interface.ramen;

public class SinRamen extends Ramen{

	public SinRamen(String name, int price) {
		super(name, price);
	}

	@Override
	public void printRecipe() {

		System.out.println("끓는 물에 면과 스프를 넣고 3분 후에 드세요");
		System.out.println("물은 550ml (한강라면 스타일은 600ml)");
		
	}

}
