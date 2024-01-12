package ch09_class;

import java.util.ArrayList;
import java.util.Scanner;

public class TypingMain {
	
	
	public static void main(String[] args) {
		
		int num;
		if(args.length > 0) {
			num = Integer.parseInt(args[0]);
		}
		else {
			num = Dictionary.OPTION_RANDOM_ALPH; // 클래스의 전역상수 (클래스명.상수명)
		}
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> wordList = 
				Dictionary.makeWordList(num); // Class static method
		
		long before = System.currentTimeMillis(); // UTC 기준시 부터 지금까지 밀리초
		
		while(true) {
			int randIdx = (int)(Math.random() * wordList.size());
			
			// 단어 배열에서 랜덤하게 단어 출력
			System.out.println(wordList.get(randIdx));
			System.out.print(">>> ");
			String input = scan.nextLine();
			
			// 문제 단어와 입력단어가 일치하면 삭제
			if (wordList.get(randIdx).equals(input)) {
				wordList.remove(randIdx);
			}
			
			// 단어가 없으면 종료
			if (wordList.size() == 0) {
				break;
			}
			
			
		}
		long after = System.currentTimeMillis();
		long diff = after - before;
		double result = diff / 1000.0; // 초로 변경
		System.out.println(result + "초 걸리셨습니다.");
		
	}
	
	
}
