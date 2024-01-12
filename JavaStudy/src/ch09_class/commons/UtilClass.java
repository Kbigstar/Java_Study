package ch09_class.commons;

public class UtilClass {

	/**
	 * @메소드 설명 : 입력한 소수를 반올림하여 소수 n번째 자리로 리턴한다.
	 * @param : num 반올림 하고자 하는 소수
	 * @param : 소수 n번째 자리까지 리턴
	 * @return : 반올림된 소수를 리턴
	 */
	public static double weRound(double num, int n) {
		
		// 10의 n제곱 구하기
		int ten = 1;
		for(int i = 0; i < n; i++) {
			ten *= 10;
		}
		num *= ten;
		long temp = Math.round(num);
		
		double result = (double)temp/ten;
		
		return result;
	}
	
	public static void main(String[] args) {
		// 외부에서는 보이지않음
		// UtilClass 자체에서 결과를 확인하기 위해서만 실행됨
		System.out.println(weRound(75.123456789, 3));
	}
	
	
	
}
