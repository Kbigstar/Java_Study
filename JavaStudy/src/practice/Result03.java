package practice;

import java.util.Scanner;

public class Result03 {

	public static void main(String[] args) {
		
		// 문제 1번
		// 아주 힘차게(최대)가 5834
		// int roulette = 5834;
		int roulette = (int) (Math.random() * 5834);
		int count = 0;
		

		
		String prize = "";
		
		if (roulette % 360 >= 0 && roulette % 360 < 60) {
			count = roulette / 360;
			prize = "사탕";
		}
		else if (roulette % 360 >= 60 && roulette % 360 < 120) {
			count = roulette / 360;
			prize = "초콜릿";
		}
		else if (roulette % 360 >= 120 && roulette % 360 < 180) {
			count = roulette / 360;
			prize = "쿠키";
		}
		else if (roulette % 360 >= 180 && roulette % 360 < 240) {
			count = roulette / 360;
			prize = "콜라";
		}
		else if (roulette % 360 >= 240 && roulette % 360 < 300) {
			count = roulette / 360;
			prize = "아이스크림";
		}
		else if (roulette % 360 >= 300 && roulette % 360 < 360) {
			count = roulette / 360;
			prize = "커피";
		}
		
		System.out.println("룰렛 결과 : " + roulette);
		System.out.printf("%d바퀴 경품 : %s", count, prize);
		System.out.println(" ");
		System.out.println(" ");
		
		// 문제 2번
		Scanner scan = new Scanner(System.in);
		
		System.out.print("거꾸로 뒤집을 문자열 입력 : ");
		String str = scan.nextLine();
		String strTmp = "";
		
		
		
		for (int i = str.length()-1; i >= 0; i--) {
			 
			strTmp += str.charAt(i);
			
		}
		
		System.out.println("원본 : " + str);
		System.out.println("뒤집은 결과 : " + strTmp);
		
		System.out.println("");

		// 문제 3-1번
		for(int i = 1; i < 10; i+=2) {
			for (int j = 9; j > i; j-=2) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		
		// 문제 3-2번
		for(int i = 10; i > 1; i-=2) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			for (int k = 10; k >= i; k-=2) {
				System.out.print(" ");
			}
			
			
			
		}
		
	}
	
	
}
