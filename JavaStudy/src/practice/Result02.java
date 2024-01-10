package practice;

import java.util.Scanner;

public class Result02 {
	
	public static void main(String[] args) {
		
		// 문제 1
		int kor = 0;
		int eng = 0;
		int mat = 0;
		
		double avg = 0.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요");
		System.out.print(">>> ");
		kor = Integer.parseInt(scan.nextLine());
		
		System.out.println("영어 점수를 입력해주세요");
		System.out.print(">>> ");
		eng = Integer.parseInt(scan.nextLine());
		
		System.out.println("수학 점수를 입력해주세요");
		System.out.print(">>> ");
		mat = Integer.parseInt(scan.nextLine());
		
		avg = (kor+eng+mat) / 3.0;
		
		System.out.printf("평균 : %f\n" ,avg);
		
		if (avg >= 90) {
			System.out.println("등급 : A 등급" );
		}
		else if (avg >= 80) {
			System.out.println("등급 : B 등급" );
		}
		else if (avg >= 70) {
			System.out.println("등급 : C 등급" );
		}
		else {
			System.out.println("등급 : D 등급" );
		}
		System.out.println("");

		
		// 문제 2
		int result = 1;
		for(int i = 10; i > 0; i--) {
		
			result *= i;
		}
		// for 문 10팩토리얼 값
		System.out.println("for문을 사용해서 10팩토리얼의 값을 출력 해주세요!");
		System.out.println("결과 : " + result);

		long result2 = 1l; // 15 팩토리얼 값이 int의 값 표현보다 크다..
		for(int i = 15; i > 0; i--) {
		
			result2 *= i;
		}
		System.out.println("@ 15 팩토리얼의 값을 출력 해주세요.");
		System.out.println("결과 : " +result2);
		System.out.println("");
		
		
		// 문제 3
		String findWally = 
				"윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		
		int count = 0;
		int nIndex = 0;
		
		while(nIndex <= findWally.length()){
			
			if (findWally.indexOf("월리",nIndex) != -1) {
				count += 1;
				nIndex = findWally.indexOf("월리",nIndex);
				System.out.println(findWally.indexOf("월리",nIndex));
			}
			
			nIndex++;	
		}
		
		System.out.println("결과 : " +count);
		System.out.println("");
		
		
		// 1. 문자열 길이 이용
		int all = findWally.length();
		int after = findWally.replaceAll("월리", "").length();
		System.out.println((all - after) / 2);
		
		// 2. 동일한 문자열 수 
		int cnt = 0;
		for(int i = 0; i < findWally.length()-1; i++) {
			String subWally = findWally.substring(i, i+2);
			if (subWally.equals("월리")) {
				cnt += 1;
			}
		}
		System.out.println("월리는? " + cnt);
		System.out.println("");
		
		// 문제 4
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		String star = "*****";
		
		for(int i = 5; i > 0; i--) {
			String subStar = star.substring(0,i);
			System.out.println(subStar);
		}
		
	}
	
	
}
