package practice;

import java.util.Scanner;

public class Result04 {

	public static void main(String[] args) {
		
		// 문제 1번
		// 1~50 사이의 랜덤한 수를 생성
		int randInt = (int) (Math.random()*50+1);
		int chance = 5;
		int user;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력해주세요 : ");
			user = Integer.parseInt(scan.nextLine());
			chance--;
			
			if(randInt == user) {
				System.out.println("정답 입니다!");
				break;
			}
			else if (randInt > user && chance != 0) {
				System.out.println("업!! 기회가 " + chance + "번 남았습니다..");
			}
			else if (randInt < user && chance != 0) {
				System.out.println("다운!! 기회가 " + chance + "번 남았습니다..");
			}
			
			if(chance == 0) {
				System.out.println("실패 하였습니다.. 정답은 " + randInt + "입니다..");
				break;
			}
			
		}
		
		
		// 문제 2번
		int a = 10;
		int b = 4;
		
		int floor = 0;
		
		String userSelcet = "";
		String userMove = "";
		
		System.out.println();
		
		while(true) {
			System.out.println("============ 엘리베이터 ============");
			System.out.println("");
			System.out.println("승강기 A의 현재 위치 : " + a);
			System.out.println("승강기 B의 현재 위치 : " + b);
			System.out.print("승강기를 선택하시겠습니까? (a or b 싫으면 x) : ");
			userSelcet = scan.nextLine();
			
			if (userSelcet.equals("a") || userSelcet.equals("A")) {
				System.out.print("몇층에 가시나요? [종료는 q 또는 exit] : ");
				userMove = scan.nextLine();
				if (userMove.equals("q") || userMove.equals("Q") || userMove.equals("exit") || userMove.equals("EXIT") || userMove.equals("Exit") ) {
					System.out.println("프로그램을 종료합니다!");
					break;
				}
				floor = Integer.parseInt(userMove);
				
				System.out.println("엘리베이터 A가 " + floor +"층으로 이동하였습니다!");
				a = floor;
				continue;
			}
			else if(userSelcet.equals("b") || userSelcet.equals("B")) {
				System.out.print("몇층에 가시나요? [종료는 q 또는 exit] : ");
				userMove = scan.nextLine();
				
				if (userMove.equals("q") || userMove.equals("Q") || userMove.equals("exit") || userMove.equals("EXIT") || userMove.equals("Exit") ) {
					System.out.println("프로그램을 종료합니다!");
					break;
				}
				floor = Integer.parseInt(userMove);
				
				System.out.println("엘리베이터 B가 " + floor +"층으로 이동하였습니다!");
				b = floor;
				continue;
			}
			else if(userSelcet.equals("x") || userSelcet.equals("X")) {
				System.out.println("엘리베이터를 선택하지 않으셨습니다..");
			}
			else {
				System.out.println("a or b 싫으면 x 중에서 만 입력 가능합니다..!");
				continue;
			}
			
			System.out.print("몇층에 계시나요? [종료는 q 또는 exit] : ");
			userMove = scan.nextLine();
			
			if (userMove.equals("q") || userMove.equals("Q") || userMove.equals("exit") || userMove.equals("EXIT") || userMove.equals("Exit") ) {
				System.out.println("프로그램을 종료합니다!");
				break;
			}
						
			
			floor = Integer.parseInt(userMove);
		

			if (Math.abs(a-floor) < (Math.abs(b-floor))) {
				
				System.out.println("엘리베이터 A가 " + floor +"층으로 이동하였습니다!");
				a = floor;
			}
			else if (Math.abs(a-floor) > (Math.abs(b-floor))) {
				
				System.out.println("엘리베이터 B가 " + floor +"층으로 이동하였습니다!");
				b = floor;
			}
			else if (Math.abs(a-floor) == (Math.abs(b-floor))) {
				if (a > b) {
					System.out.println("엘리베이터 A가 " + floor +"층으로 이동하였습니다!");	
					a = floor;
				}
				else {
					System.out.println("엘리베이터 B가 " + floor +"층으로 이동하였습니다!");
					b = floor;
				}
				

			}
		
			
			
			System.out.println("");
			System.out.println("============ 엘리베이터 ============");
			System.out.println("");
		}
		
		
		
	}
	
	
	
}
