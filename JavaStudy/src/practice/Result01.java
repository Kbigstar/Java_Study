package practice;


public class Result01 {
	
	public static void main(String[] args) {
	
		// 1문제
		String name = "홍길동";
		int age = 26;
		float height = 177.9f;
		String phoneNum = "010-7398-7332";
		String email = "gildong@email.com";
		
		System.out.printf("이름: %s\n나이: %d\n키: %.1f\n연락처: %s\n이메일: %s\n",
				name, age, height, phoneNum, email);
		
		// 2문제
		String enigma = "너오구늘리뭐너먹구지리";
		
		// 이렇게도 할 수 있다.. 
		// enigma = enigma.replace("너","").replace("구","").replace("리","");
		enigma = enigma.replace("너","");
		System.out.println("\n1차 암호 해독 [너 제거]: " + enigma);
		enigma = enigma.replace("구","");
		System.out.println("2차 암호 해독 [구 제거]: " + enigma);
		enigma = enigma.replace("리","");
		System.out.println("3차 암호 해독 [리 제거]: " + enigma);
		System.out.println("해독완료!! -> " + enigma);
		System.out.println(enigma);
		
		
		// 3문제
		int example = 278;
		String strNum = Integer.toString(example);
		
		String strTmp;
		int result = 0;
		
		for(int i = 0; i < strNum.length(); i++) {
		
		// strNum.charAt(i) char 형으로 리턴하기 때문에 
		// String.valuof()로 변환하여 저장 후 값을 보관한다
		// 그 후 Integer.parseInt() 로 int 값으로 변환하여 보관한다.
			
		strTmp = String.valueOf(strNum.charAt(i));
		result += Integer.parseInt(strTmp);
		
		}
		
		System.out.println("\n결과는 : " +result);
		
	}
}
