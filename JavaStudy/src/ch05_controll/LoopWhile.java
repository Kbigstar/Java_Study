package ch05_controll;

import java.util.Scanner;

public class LoopWhile {
	
	public static void main(String[] args) {
		
		// while(조건) 조건이 true이면 반복 (무한루프를 조심할 것..)
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int j = 1;
		while(true) {
			System.out.println(j);
			j++;
			if (j == 10) {
				break;
			}
		}
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("=====================");
			System.out.println("이름을 입력하세요 (종료 : q)");
			System.out.print(">>> ");
			
			String name = scan.nextLine();
			
			// .equals() 문자열이 같은지 비교
			// 숫자와 달리 String은 == 이 불가 .equals() 사용!!
			// 숫자에서는 != 을 사용하나 문자열은 !name.equals("q") 이런식으로 사용함 
			if(name.equals("q")) {
				System.out.println("종료하겠습니다.");
				flag = false;
			}
			else {
				System.out.println(name + "님 환영합니다.");
				System.out.println("=====================");
			}
		}
		
		// do-while 문
		// 최소 한번은 실행
		boolean isRun = false;
		
		do {
			// 최초 1번은 실행 하고 while의 조건에 만족할때 까지 반복.
			System.out.println("hi"); 
		} while (isRun);
		
		// 반복문 Label 활용
		int x = 0;
		outerLoop : while(x < 5) {
			int y = 0;
			
			while(y < 5) {
				if(x * y > 6) {
					System.out.println("breaking !");
					System.out.println("x : " + x + " y : " + y);
					// break; 내부의 반복문만 break 되어 다시 메인루프가 진행됨
					
					// 위와같은 문제를 해결하기 위해 
					// 반복문 자체에 라벨명을 붙여 제어한다.
					break outerLoop;
				}
				y++;
			}
			x++;
		}
		
		// while 문을 활용하여 구구단 2~9단을 출력하시오.
		int dan = 2;
		int number = 1;
		
		while(dan <= 9) {
			System.out.println("======== " + dan + "단 ========");
			while(number <= 9 ) {
				System.out.println(dan + " x " + number + " = " + (dan*number) );
				number++;
			}
			// while문은 for문 과 같이 초기화가 없기 때문에
			// ex) for(int i = 1; i <= 9; i++)
			// 다시 초기화 해줘야 이중 while 문의 내부 조건을 계속 사용할 수 있다.
			number = 1;
			dan++;
			
		}
		
	}
	
}
