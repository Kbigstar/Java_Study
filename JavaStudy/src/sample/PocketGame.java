package sample;

import java.util.Scanner;

public class PocketGame {
	
	public static void main(String[] args) {
		
		int enemyHp = 100;
		Scanner scan = new Scanner(System.in);
		
		outher: while(true) {
			System.out.println("야생의 파이리를 만났습니다.");
			System.out.println("행동을 선택 해주세요 !!");
			System.out.println("1. 공격 | 2. 도망");
			System.out.print(">>> ");
			
			int command = Integer.parseInt(scan.nextLine());
			
			if (command == 1) {
				while(true) {
					System.out.println("공격 방법 선택!!");
					System.out.println("1. 백만볼트 | 2. 전광석화 |3. 취소");
					System.out.print(">> ");
					int select = Integer.parseInt(scan.nextLine());
					
					if (select == 1) {
						System.out.println("피~ 카~~ 츄~!");
						enemyHp -= 20;
						
					}
					else if(select == 2) {
						System.out.println("삐까삐까!!");
						enemyHp -= 10;
					}
					else if(select == 3) {
						System.out.println("공격 취소");
						break;
					}
					System.out.println("적의 현재 체력 : " + enemyHp);
					if (enemyHp <= 0) {
						System.out.println("잡았다 !!");
						break outher; // 메인 루프 탈출
					}
				}
			}
			else if(command == 2) {
				System.out.println("도망 쳤습니다..!");
				break;
			}
		}
		
		
	}

}
