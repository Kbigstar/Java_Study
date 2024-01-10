package ch04_operator;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		
		// 사용자에게 이메일 주소를 입력받고
		// @가 포함되어 있을경우 (사용가능) 없을경우 (이메일형식이 아님)
		// ex) indexof는 대상 문자열이 없을 경우 -1 있을경우 해당 인덱스값 반환

		// 1. Scanner 생성
		// 2. email 입력 메세지 출력
		// 3. 입력받은 데이터를 가지고 비교 조건식 작성
		// 4. 결과 출력
		System.out.println("이메일 주소를 입력 해주세요.");
		System.out.print(">>>"); 

		Scanner scanner = new Scanner(System.in);

		String email = scanner.nextLine();

		String checkEmail = (email.indexOf("@") != -1 && email.indexOf("@") != 0) ? ("사용가능") : ("이메일 형식이 아닙니다.");
//		String checkEmail = (email.indexOf("@") > -1 && email.indexOf("@") > 0) ? ("사용가능") : ("이메일 형식이 아닙니다.");
//		String checkEmail = (email.indexOf("@") == -1 && email.indexOf("@") <= 0) ? ("이메일 형식이 아닙니다.") : ("사용가능");
		System.out.println(checkEmail);

	}

}
