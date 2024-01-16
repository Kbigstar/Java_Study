package ch10_extends_interface.account;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArr = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		int index = 0;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 >");
			
			int selectNum = Integer.parseInt(scan.nextLine());
			if (selectNum == 1) {
				// 계좌 생성 메소드
				System.out.print("계좌번호 : ");
				String bankNum = scan.nextLine();
				
				
				System.out.print("계좌주 : ");
				String name = scan.nextLine();
				
				
				System.out.print("초기 입금액 : ");
				int money = Integer.parseInt(scan.nextLine());			
				
				accountArr[index] = new Account(bankNum, name, money);				
				System.out.println(accountArr[index].getBankNumber());
				index++;
				
			}
			else if(selectNum == 2) {
				// 계좌 목록 출력 메소드
				for(int i = 0; i < accountArr.length; i++) {
					if (accountArr[i] != null ) {
						System.out.println(accountArr[i]);
					}
				}
			}
			else if(selectNum == 3) {
				// 예금 메소드
				System.out.println("--------");
				System.out.println("예금");
				System.out.println("--------");
				System.out.print("계좌번호 : ");
				String bankNum2 = scan.nextLine();
				System.out.print("예금액 : ");
				int insertMoney = Integer.parseInt(scan.nextLine()); 
				for(int i = 0; i < accountArr.length; i++) {
					
					if (accountArr[i] == null) {
						break;
					}
					else if (bankNum2.equals(accountArr[i].getBankNumber())) {
						accountArr[i].insertMoney(insertMoney);					
					}

				}
				
			int n = scan.nextInt();
			
			}
			else if(selectNum == 4) {
				// 출금 메소드
				System.out.println("--------");
				System.out.println("출금");
				System.out.println("--------");
				System.out.print("계좌번호 : ");
				String bankNum2 = scan.nextLine();
				System.out.print("예금액 : ");
				int afterMoney = Integer.parseInt(scan.nextLine()); 
				
				for(int i = 0; i < accountArr.length; i++) {
					if (accountArr[i] == null) {
						break;
					}
					else if (bankNum2.equals(accountArr[i].getBankNumber())) {
						accountArr[i].afterMoney(afterMoney);					
					}

				}
			
			}
			else if(selectNum == 5) {
				run = false;
			}
		}
		System.out.print("프로그램 종료");
	}
}
