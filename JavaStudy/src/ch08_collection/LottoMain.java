package ch08_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LottoMain {
	
	
	public static void main(String[] args) {
		
		// user 희망하는 로또 수량을 입력받아 수량만큼 만들어주세요
		
		// lotto 번호는 1 ~ 45 (중복X) 6개 번호
		int lotto;
		
		lotto = (int)(Math.random() * 45 + 1);
		
//		Scanner scan = new Scanner(System.in);
		
		System.out.println(makeLotto());
		System.out.println("");
		HashSet<Integer> userNum = new HashSet<Integer>();
		userNum.add(8);
		userNum.add(21);
		
		System.out.println("사용자가 선택한 번호 : " + userNum);
		System.out.println(makeLotto(userNum));
		System.out.println(makeLotto(userNum));
		System.out.println(makeLotto(userNum));
	}
	
	public static HashSet<Integer> makeLotto() {
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() < 6) {
	
			int randInt =(int)(Math.random() * 45 + 1); 		
			lotto.add(randInt);	
		}
		
		return lotto;
	}
	
	
	public static HashSet<Integer> makeLotto(HashSet<Integer> userNum) {
		
		HashSet<Integer> lotto = new HashSet<Integer>(userNum);
		
		while(lotto.size() < 6) {
			int randInt = (int)(Math.random() * 45 + 1); 		
			lotto.add(randInt);	
		}
		
		return lotto;
		
	}
	
	
	
	
}
