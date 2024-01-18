package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {

	
	public static void main(String[] args) {
		System.out.println("메인시작");
		int [] arr = {1,2,3};
		String aString = null;
		
		try {
//			System.out.println(arr[3]);
			aString.length();
		} catch (ArrayIndexOutOfBoundsException e) { // array 인덱스 문제
			System.out.println("인덱스 문제군!!");
		}catch (Exception e) { 
			System.out.println("문제 발생!!");
			e.printStackTrace();
		}
		System.out.println("메인 종료!");
		
		try {
			ExMethod.printName("");
		} catch (BizException e) {
			System.out.println(e.getErrCode());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(ExMethod.dateMillSec2("2024/01/18"));
		try {
			System.out.println(ExMethod.dataMillSec("20240118"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");
	}
	
	
}
