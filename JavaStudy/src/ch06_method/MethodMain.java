package ch06_method;

import java.util.Scanner;

/**
 * Class Name   : MethodMain
 * Author       : KwonBoSung
 * Created Date : 2024. 1. 8.
 * Version      : 1.0
 * Purpose      : Method study 
 * Desciption   :  Java의 함수 method
 */

public class MethodMain {
	
	
	public static void main(String[] args) {
		
		// Method(메소드) 클래스나 객체에 종속된 함수
		// java는 모두 class에 작성되기 때문에 함수를 메소드라 부름.
		// 1 ~ 100 까지 더 한 결과는?
		// 1 ~ 50 까지 더 한 결과는?
		// 30 ~ 60 까지 더 한 결과는?
		
		printSum(1, 100);
		printSum(1, 50);
		printSum(30, 60);
		
		int res = returnSum(1, 30);
		System.out.println("리턴 받은 값 : " + res);
		
		
		print("hi");
		print(100);
		
//		Scanner scan = new Scanner(System.in);
		System.out.println(absNum(-10));
		System.out.println(absNum(10));
		System.out.println(absNum(100));
		
		System.out.println(); 
	}
	
	// 메소드 생성
	// [접근제어자 static] 리턴타입 메소드 명(파라미터) { }
	
	public static void printSum(int from, int to) {
		
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum += i;
		}
		
		System.out.printf("from : %d 부터 to : %d 까지 합 : %d\n", from, to, sum);
	}	
	
	public static int returnSum(int from, int to) {
		
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum += i;
		}
		
		
		return sum;
	}
	
	public static void print (String msg){
		System.out.println(msg);
	}
	
	// 메소드 오버로딩 동일한 이름의 메소드를 다른 입력과, 리턴으로 정의 할 수 있다.
	public static void print(int msg) {
		System.out.println(msg);
	}
	
	// 정수를 입력받아 절대값을 정수형으로 리턴하는 메소드를 작성하시오!
//	public static int absNum(int inputNum) {
//		// Math 라이브러리 사용
//		return Math.abs(inputNum);
//		
//	}
	
	
	public static int absNum(int inputNum) {
		// Math 라이브러리 미사용
		
		if (inputNum < 0) {
		
			return (inputNum*-1);
		}
		
//		if (inputNum < 0) {
//			
//			inputNum *= -1;
//		}
		
		return inputNum;
	}
	
}

