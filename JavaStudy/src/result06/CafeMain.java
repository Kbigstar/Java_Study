package result06;

import java.util.Scanner;

public class CafeMain {
	
	public static void main(String[] args) {
		
		Cafe star = new Cafe("스타벅스");
		Cafe aka = new Cafe("아카");
		
		Coffee starCf1 = new Coffee("아메리카노", 5000);
		Coffee starCf2 = new Coffee("카푸치노", 6000);
		Coffee starCf3 = new Coffee("오곡라떼", 7000);
		
		Coffee akaCf1 = new Coffee("아메리카노", 2500);
		Coffee akaCf2 = new Coffee("바닐라라떼", 3000);
		Coffee akaCf3 = new Coffee("아이스티", 3500);
		
		star.addCoffee(starCf1);
		star.addCoffee(starCf2);
		star.addCoffee(starCf3);
		
		aka.addCoffee(akaCf1);
		aka.addCoffee(akaCf2);
		aka.addCoffee(akaCf3);
		
		star.showMenu();
		aka.showMenu();
		
		Scanner scan = new Scanner(System.in); 
		
		while(true) {
			
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 스타벅스 방문 | 2. 아카 방문 | 3. 사무실로 복귀..");
			System.out.print(">>> ");
			int userSelect = Integer.parseInt(scan.nextLine());
			
			if (userSelect == 1) {
				System.out.println("어서오세요 " + star.getName() + " 입니다.");
				star.showMenu();
				System.out.print("메뉴를 선택해주세요 : ");
				star.buyCoffee(scan);
			}
			else if (userSelect == 2) {
				System.out.println("어서오세요 " + aka.getName() + " 입니다.");
				aka.showMenu();		
				System.out.print("메뉴를 선택해주세요 : ");
				aka.buyCoffee(scan);
			}
			else if (userSelect == 3) {
				System.out.print("사무실로 돌아갑니다..");
				break;
			}
			System.out.println();
			
		}
	
		
	}

	
}
