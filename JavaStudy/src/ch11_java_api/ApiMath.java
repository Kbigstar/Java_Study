package ch11_java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class ApiMath {

	
	public static void main(String[] args) {
		
		// Math
		// 수학에서 사용되는 여러가지 함수들을 메서드로 제공하는 클래스
		final double PI = 3.141592;
		
		//반올림 round
		long roundPI = Math.round(PI);
		System.out.println(roundPI);
		
		//소수 넷째 자리에서 반올림
		double fourPI = (Math.round(PI * 1000)) / 1000.0;
		System.out.println(fourPI);
		
		// 올림 ceil
		double ceilPI = Math.ceil(PI);
		System.out.println(ceilPI);
		
		// 내림 floor
		double floorPI = Math.floor(PI);
		System.out.println(floorPI);
		
		// 절대값
		int minus = -10;
		System.out.println(Math.abs(minus));
		
		// 제곱 3의 4제곱
		double powVal = Math.pow(3, 4);
		System.out.println(powVal);

		// 제곱근 (루트)
		System.out.println(Math.sqrt(powVal));
		
		// 랜덤 숫자(난수) 생성
		// 0 ~ 1 사이 실수 리턴 (0포함, 1포함하지 않음)
		for(int i = 0; i < 100; i++) {
//			System.out.println(Math.random());
			System.out.println(randomCard());
		}
		
		// 1 ~ 45
		int lotto = (int)(Math.random() * 45) + 1;
		System.out.println(lotto);
		
		// 10 ~ 20 랜덤숫자
		int ranNum = (int) (Math.random() * 11) + 10;
		System.out.println(ranNum);
		
		
		ArrayList<String> classMateList = new ArrayList<>(Arrays.asList("강성준", "권보성", "권유빈", "김기찬", "김대영", "김동우", "김동현",
				"김명기", "김영주", "김유정", "김은혜", "김휘건", "나항진", "문성민", "박진기", "백현진", "오정연", "유하영", "이예진", "이용빈", "정유진"));
		
		
		HashMap<String, String> result = randomGame(classMateList);
		Set<String> keySet = result.keySet();
		for(String key:keySet) {
			System.out.println(key + " 님은 " + result.get(key));
		}
		
	}
	
	public static String randomCard() {
		String result = null;
		
		// Random은 class로도 존재한다.
		Random random = new Random();
		
		// 1 ~ 100 사이의 정수
		int num = random.nextInt(100)+1;
		
		// 10% 확률 당첨
		if (num <= 10) {
			result = "당첨";
		}
		else {
			result = "꽝";
		}
		
//		System.out.println(num);
		return result;
	}
	
	public static HashMap<String, String> randomGame(ArrayList<String> arr) {
		HashMap<String, String> resultMap = new HashMap<String, String>();
		
		//input 으로 입력받은 arr 만큼
		for(int i = 0; i < arr.size(); i++) {
			// key : 학생이름, value : 당첨 or 꽝
			resultMap.put(arr.get(i), randomCard());
		}
		return resultMap;
	}
	
}
