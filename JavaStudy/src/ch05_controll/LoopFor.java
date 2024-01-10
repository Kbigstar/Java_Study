package ch05_controll;

import java.util.Iterator;

public class LoopFor {
	
	public static void main(String[] args) {
	
		int num = 1;
		
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		
		// for문 으로
		System.out.println("========for문========");
		// [1] 초기화식; [2] 조건식; [4] 증감식
		for (int i = 1; i < 11; i++)
		{
			// [3] 실행문
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i = 1; i <= 20; i++)
		{
			sum+=i;
		}
		System.out.println("1~20을 더하면? : " +sum);
		int sum2 = 0;	
		for(int i = 21; i <= 45; i++)
		{
			
			sum2 += i;
		}
		System.out.println("21~45을 더하면? : " +sum2);
	
		// 1부터 40까지 중에 짝수만 더한 값을 출력하시오! [if문 사용]
		int sum3 = 0;
		for(int i = 1; i <= 40; i++) {
			if (i % 2 == 0) {
				sum3 += i;
				}
			}
		System.out.println("1~40까지 중에 짝수만 더한 값은? : " +sum3);
		
		// 1부터 40까지 중에 짝수만 더한 값을 출력하시오! [if문 없이 위와 같은 결과]
		int sum4 = 0;
		for(int i = 0; i <= 40; i+=2) { // i의 값이 2씩 증가하기때문에 0부터 시작.
				sum4 += i;
			}
		System.out.println("1~40까지 중에 짝수만 더한 값은? : " +sum4);
		
		int dan = 2;
		int result = 0;
		System.out.println("==== 구구단 2단 ====");
		for(int i = 1; i<=9; i++) {
			result = dan * i;
			System.out.println(dan+" x "+i+" = "+result);
		}
		
		int result2 = 0;
		for (int i = 2; i<=9; i++) {
			System.out.println("======== 구구단 "+i+"단 ========");
			for(int j=1; j<=9; j++) {
				result2 = i * j;
				System.out.println(i+" x "+j+" = "+result2);
				
			}
		}
		
//		for (int i = 2; i<=9; i++) { 위와 같음
//			System.out.println("======== 구구단 "+i+"단 ========");
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d x %d = %d \n", i, j, i*j);
//			}
//		}
		
		
//		System.out.println("*");
//		System.out.println("**");
//		System.out.println("***");
//		System.out.println("****");
//		System.out.println("*****");
		
		String star ="";
		for(int i = 0; i < 5; i++){
			star += "*";
			System.out.println(star);
			
		}
		
		// 10부터 1까지 출력
		for(int i = 10; i>=1; i--) {
			System.out.println(i);
		}
	
		// break 문 활용
		// 반복문 내에서 break문이 실행되면 "해당 반복문"을 즉시 종료한다.
		int nSum = 0;
		
		for(int i=1; i<9999; i++) {
			nSum += i;
			if (nSum >= 100) {
				System.out.println("100이상이 되는 n : " +i);
				break;
			}
		}
		
		// continue 
		for(int i=0; i<=10; i++) {
			if(i % 2 ==0) {
				continue; // continue를 만나면 건너뜀
				// 그러므로 조건에 따라 홀수만 출력 됨
			}
			System.out.println(i);
		}
		
		
	
	// 구구단 2~9단 출력
	// 단, 5단/8단은 제외시킨다
	int result3 = 0;
	for (int i = 2; i<=9; i++) {
		
		if(i == 5 || i == 8)
		{
			continue;
		}
		
		System.out.println("======== 구구단 "+i+"단 ========");
		for(int j=1; j<=9; j++) {
			
			result3 = i * j;
			System.out.println(i+" x "+j+" = "+result3);
			
			}
		}
	
		// 국수공장에서 면을 100cm 뽑고 있는데, 
		// 5cm씩 뽑고 잘라줘야 합니다...
		for(int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println("---------");
				//continue;
			}
			System.out.println("|||||||||");
			
		}
	
	
	
	
	
	
	}
}
	
	