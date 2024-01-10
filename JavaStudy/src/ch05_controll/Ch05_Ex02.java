package ch05_controll;

import java.util.Scanner;

public class Ch05_Ex02 {

	public static void main(String[] args) {
		
		// 메뉴를 입력받아 가격을 출력 (switch 사용하기)
		// 아아 or 아이스아메리카노 : 3000
		// 라떼 : 4500
		// 에스프레소 : 2500
		// 위의 메뉴로 입력하면 "입력 메뉴 ㅇㅇㅇ은 ㅇㅇㅇ원 입니다." 출력
		// 없는 메뉴면 "저희 매장에 없는 메뉴 입니다.
		
		int salePrice = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메뉴를 주문하세요");
		System.out.print(">>> ");
		String menu = scan.nextLine();
		
		
		
		switch (menu) {
			case "아아":
				case "아이스아메리카노":	
					salePrice = 3000;
					System.out.printf("입력메뉴 %s는 %d원 입니다.", menu, salePrice);
					break;
			
			case "라떼":
				salePrice = 4500;
				System.out.printf("입력메뉴 %s는 %d원 입니다.", menu, salePrice);
				break;
			
			case "에스프레소":
				salePrice = 2500;
				System.out.printf("입력메뉴 %s는 %d원 입니다.", menu, salePrice);
				break;
				
			default:
				System.out.printf("입력메뉴 %s는 저희 매장에 없는 메뉴 입니다.", menu);
		}
		
		}
	}
	

