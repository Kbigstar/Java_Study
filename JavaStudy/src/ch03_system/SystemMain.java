package ch03_system;

import java.util.Scanner;

/**
 * Class Name : SystemMain 
 * Author : KwonBoSung 
 * Created Date : 2024. 1. 3.
 * Version : 1.0 
 * Purpose : system class 
 * Desciption : 표준 입출력 공부
 */
public class SystemMain {

	public static void main(String[] args) {
		// 한줄 주석
		// javadoc 주석 Shift + Alt + j
		System.out.print("hi"); // 이어서 출력
		System.out.print("hi"); // 이어서 출력
		System.out.println("hi"); // 출력후 한줄 띄움
		System.out.println("hi"); // 출력후 한줄 띄움
		System.err.println("오류 입니다."); // 에러 메세지

		// Ctrl +a 전체 선택후 Ctrl+shift+f 정렬
		
		//이스케이프 문자사용
		// \n 줄 개행, \t 탭
		System.out.println("중간에 \n 넣으면 개행이 됨");
		System.out.println("중간에 \t 넣으면 탭 효과");

		// "" 자체가 언어 이기때문에 출력시 사용하려면 \"ㅇㅇ\" --> "ㅇㅇ" 출력
		System.out.println("중간에 특수문자 사용 \"이렇게\"");
		
		// printf() 포멧 문자열 형태로 사용 
		// 소수점 두번째 까지 출력
		System.out.printf("원주율은 %.2f \n", 3.141592);
		
		//여러개 출력 가능 ("대상 문자열", 값1, 값2,....)
		System.out.printf("%d명이 %s를 듣고 있습니다.", 21, "Java수업");
		
		System.out.println("====== 표준 입력 ======");
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>> ");
		
		//키보드 입력을 기다림
		String nm = scan.nextLine();
		//입력받은 내욜을 출력
		System.out.println(nm + " 님 환영합니다.");
		System.out.println("나이를 입력해주세요.");
		System.out.print(">>> ");
		int age = Integer.parseInt(scan.nextLine());
		System.out.printf("%s 님 나이는 %d 이군요.", nm ,age);
		scan.close(); // 스캐너 종료 시켜주기..
		
		
		
	}

}
