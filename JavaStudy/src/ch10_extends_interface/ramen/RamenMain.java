package ch10_extends_interface.ramen;

public class RamenMain {

	
	public static void main(String[] args) {
		SinRamen sin = new SinRamen("신라면", 1100);
		sin.printRecipe();
		
		JjaPpagheti jja = new JjaPpagheti("짜파게티", 1200);
		jja.printRecipe();
		
//		Ramen ramen = new Ramen(); // 오류남 (상속받지 않고서는 사용 할 수 없다.)
	}
	
	
}
