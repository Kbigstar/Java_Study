package ch02_variable;

public class VariableMain {

	public static void main(String[] args) {
		// 상수(Constant) 변경 불가한 숫자
		final double MATH_PI = 3.14;
//		MATH_PI = 4.23; // 오류 (상수는 변경 불가)
		
		double mathPi2 = 3.11;
		mathPi2 = 3.14; // 변수는 문제없이 변경 가능 
	
	// 문자열 String 타입은 클래스로 관리되어짐. (다양한 메소드(함수)를 내장하고 있음) 
		
		String fruits = "Apple, Banana, Cherry";
		// .length() 문자열의 길이를 리턴
		System.out.println(fruits);
		System.out.println("문자열 길이 :" + fruits.length()); // 함수는 함수명() <-- 실행
		
		// .charAt(인덱스) 인덱스에 있는 값을 char 형으로 리턴
		System.out.println("4인덱스 :" + fruits.charAt(4));
		
		// .indexOf (문자열)
		// 해당 String에서 '문자열'을 찾아서 첫번째 인덱스를 반환 존재하지 않으면 -1 반환
		System.out.println("Banana 시작 인덱스 :" + fruits.indexOf("Banana"));
		
		//.substring (시작 인덱스) 해당 문자열의 시작 인덱스 부터 끝까지 자른다.
		//.substring (시작, 종료인덱스) 해당 문자열의 시작 인덱스 부터 끝 인덱스 전까지 자른다.
		System.out.println(fruits.substring(15));
		System.out.println(fruits.substring(7,13));
		
		// .replace (바뀔 문자열 , 바꿀 문자열)
		System.out.println(fruits.replace("Cherry", "Chamwui"));
		
		// , <-- 를 찾아서 | 로 변경 하시오
		System.out.println(fruits.replace(",", "|"));
		
		String email = "leeapgil@gmail.com";
		// @를 기준으로 앞뒤로 문자열을 출력하시오
		// leeapgil
		// gmail.com
		
		System.out.println("\n문자열 길이 :" + email.length());
		System.out.println("@ 인덱스 :" + email.indexOf("@"));
		System.out.println(email.substring(0,8));
//		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(9,18));
//		System.out.println(email.substring(8+1);
//		System.out.println(email.substring(email.indexOf("@")+1));
		
	}
	
}
