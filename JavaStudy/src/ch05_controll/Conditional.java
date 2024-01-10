package ch05_controll;

import java.util.Scanner;

// Shift + Alt + J

/**
 * Class Name   : Conditional
 * Author       : KwonBoSung
 * Created Date : 2024. 1. 4.
 * Version      : 1.0
 * Purpose      : 조건문 
 * Desciption   : IF문 
 * */

public class Conditional {

	// 전역변수
	// class 중괄호 안에 어디서든 사용이 가능하다.
	static String subject = "조건문";
	
	
	public static void main(String[] args) {
		int price = 30000;
		int myMoney = 10000;

		//조건문 if문
		if (myMoney < price) {
			System.out.println("돈이 부족합니다.");
			
		}
		
		System.out.println("============");
		
		// 변수의 사용 범위(scope)
		// 중괄호 블록{} 내부에 선언된 변수는 중괄호 바깥에서 사용할 수 없다.
		
		String str;
		
		if (myMoney < price) {
		
			// String str = "돈이 부족함";
			// 중괄호 안에서 선언된 변수는 중괄호 안에서만 참조할 수 있다.			
			str = "돈이 부족함";
		}
		else {
			str = "돈이 충분함";
		}
		System.out.println(str);
		
		// 조건이 1개 이상일 경우
		int score = 85;
		String grade = "";
		
		if (score >= 90) { // 조건 1
			grade = "A";
		}
		else if (score >= 80) { // 조건 2
			grade = "B";	
		}
		else if (score >= 70){ // 조건 3
			grade = "C";
		}
		else { // 조건1, 2, 3 외의 결과는 grade "E"로 처리
			grade = "E";
		}
		System.out.println(grade);
		
		// 순서에 주의 해야한다.
		score = 92;
		if (score >= 80) {
			grade = "B";
		}
		else if (score >= 90) {
			grade = "A";
		}
		// 위 결과 80에도 참이므로 90의 조건인 else if로 넘어가지 않아
		// A임에도 B가 출력되는 상황이 발생한다.
		System.out.println(grade);
		
		Boolean flag = false;
		if (flag) { // true
			str = "if문 1번째 조건식";
		}
		else { //false
			str = "그 밖에";
		}
		System.out.println(str);
		
		// 중첩 if문 (if 안에 if)
		// 조건1 : 이름은 1글자 이상
		// 조건2 : 전화번호는 10 or 11자리
		// 조건3 : 나이는 14세 이상
		
		String name = "권보성";
		String phone = "01049151208";
		int age = 20;
		
		//Scanner scan = new Scanner(System.in);
        //System.out.println("======== 회원가입 ========");
		//System.out.print("이름을 입력하세요 >>>");
		//name = scan.nextLine();
		//System.out.print("전화번호를 입력하세요 >>>");
		//phone = scan.nextLine();
		//System.out.print("나이를 입력하세요 >>>");
		//age = Integer.parseInt(scan.nextLine());
		
		
		
		// 이름 조건
		if (name.length() >= 1) {
			// 전화번호 조건
			if (phone.length() == 10 || phone.length() == 11) {
				if (age >= 14) {
					str = "회원가입 성공";
				}
				else {
					str = "나이가 조건에 만족하지 않습니다.";
				}
			}
			else {
				str = "전화번호가 조건에 만족하지 않습니다.";
			}
			
		}
		else {
			str = "이름이 조건에 만족하지 않습니다.";	
		}
		System.out.println(str);
		//scan.close();
		
		
		// switch문 단순 값을 매칭하는 경우 사용한다. (코드 해석이 쉬움)
		int num = 1;
		
		switch (num) {
			case 0: // switch(값)이 0일 경우
				System.out.println("수강등록");
				break;
			
			case 1: // switch(값)이 1일 경우
				System.out.println("기초 프로그래밍");
				break;
			
			case 2: 
				System.out.println("데이터베이스");
				break;
				
			default: // 그 밖에
				System.out.println("취업관련!");
		}
		
		
		
	}

}
