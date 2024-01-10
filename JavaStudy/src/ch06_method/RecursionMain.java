package ch06_method;

public class RecursionMain {
	
	
	public static void main(String[] args) {
		
		
		Func(5);
		
		// for문 
		System.out.println(factorial(4));
		System.out.println(factorial(10));
		System.out.println(factorial(15));
		
		// 재귀함수
		System.out.println(recFactorial(3));
		System.out.println(recFactorial(10));
		System.out.println(recFactorial(15));
		
		studentGrade("길동", 90, 80, 75);
	}
	
	// 재귀함수
	public static void Func(int num) {
		// 재귀함수는 멈추는게 중요하다 (잘못 작성하면 무한루프..)
		if(num == 0) {
			return;
		}
		else {
			System.out.println("Hi");
			Func(num - 1);
		}
	}
	
	// factorial
	public static long factorial(int num) {
		
		long fac = 1;
		
		for(int i = 1; i <= num; i++) {
			fac *= i;
		}
		
		return fac; 
	}
	
	// 재귀함수 활용 factorial
	public static long recFactorial(int num) {
		
		if (num == 1) {
			return 1;
		}
		/* 
		 * 3을 입력받았다면
		 * 3 * recFactorial(2)  
		 * 3 * 2 * recFactorial(1)
		 * */
		return num * recFactorial(num-1);
	}
	
	// 이름, 국어점수, 수학점수, 영어점수 를 입력받아
	// 평균과 등급을 출력하는 메소드를 작성하시오
	// input : str, int, int, int
	// output : X 없음
	// 평균 90이상 A, 80이상 B, 나머지 C
	// a님의 평균은 (소수점 2째 자리까지 출력) y등급입니다. 출력
	
	public static void studentGrade(String name, int kor, int math, int eng) {
		
		double avg;
		avg = (kor+math+eng) / 3.0;
		String strGrade;
		
		if (avg >= 90) {
			strGrade = "A";
		}
		else if (avg >= 80) {
			strGrade = "B";
		} 
		else {
			strGrade = "C";
		}
			
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.printf("%s님의 평균은 %.2f으로 %s등급 입니다.\n", name, avg, strGrade);
		
	}
	
}
