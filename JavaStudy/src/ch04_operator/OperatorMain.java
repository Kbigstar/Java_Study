package ch04_operator;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Class Name   : OperatorMain
 * Author       : KwonBoSung
 * Created Date : 2024. 1. 3.
 * Version      : 1.0
 * Purpose      : operator study
 * Desciption   : 기본 연산자 공부
 */
public class OperatorMain {
	
	public static void main(String[] args) {
		// 연산자 operator
		// 1. 증강 연산자
		int num = 10;

		num++;
		System.out.println(num);
		
		num--;
		System.out.println(num);
		
		int a, b;
		a = num++; // 후
		b = ++num; // 전
		
		System.out.printf("a: %d, b: %d", a, b);
		
		System.out.println("\n ====== 산술 연산자 ======");
		int c = a * b;
		int d = a + b;
		System.out.printf("c: %d d: %d\n", c, d);
				
		System.out.println("나머지: " + (5 % 2));
		
		System.out.println("====== 대입 연산자 ======");
		num += 1;
		System.out.println(num);
		num *= 2;
		System.out.println(num);
		num /= 2;
		System.out.println(num);
		
		System.out.println("====== 비교 연산자 ======");
		// 비교 결과에 따라 true/false 가 리턴됨.
		System.out.printf("a: %d, b: %d\n", a, b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a != b); // 같지 않다.
		System.out.println(a == b); // 같다.
		
		System.out.println("====== 삼항 연산자 ======");
		// (a) ? (b) : (c) a의 조건이 true 이면 b 아니면 c
//		String id = "nick";
//		String check = (id.length() >= 8) ? ("통과") : ("재입력");
//		System.out.println(check);
		
 
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력 해주세요. (8자 이상)");
		System.out.print(">>>");
		
		String id = scanner.nextLine();
		String checkId = (id.length() >= 8) ? ("통과") : ("재입력");
		System.out.println(checkId);
		
		
		System.out.println("성적을 입력 해주세요.");
		// 60 이상 통과 60 미만 재시험을 츨력 하시오!
		System.out.print(">>>");
		
		int score = Integer.parseInt(scanner.nextLine());
		String checkScore = (score >= 60) ? ("통과") : ("재시험");
		
		System.out.println(id + " 님은 "+ "점수가 " +score+ "점 이므로 " +checkScore+ " 입니다.");
		
		
		// 사용자의 아이디는 8 ~ 14자리 이하일 경우만 가능!
		System.out.println("====== 논리 연산자 ======");
		// and -> &&  / or -> ||
		
		System.out.println("아이디를 입력해주세요 (8~14 길이 가능)");
		System.out.print(">>>");
		String str = scanner.nextLine();
		checkId = (str.length() >= 8 && str.length() <= 14) ? 
				("사용 가능한 아이디 입니다.") : ("사용불가 합니다.. 8~14 자리로 입력하세요.");
		
		System.out.printf("아이디 %s 는 %s", str, checkId);
		
		// 90 이상 A, 80 이상 B, 나머지 C 
		System.out.println("\n성적을 입력 해주세요");
		System.out.print(">>>");
		score = Integer.parseInt(scanner.nextLine());
		String grade = (score >= 90) ? ("A") : ((score >= 80) ? ("B") : ("C"));
		System.out.println(grade);
		
		
		
	}
	
}
