package ch07_array;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Class Name   : ArrayMain
 * Author       : KwonBoSung
 * Created Date : 2024. 1. 9.
 * Version      : 1.0
 * Purpose      : Array Study 
 * Desciption   : Array 선언 및 사용법
 */

public class ArrayMain {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		String samjang = "삼장";
		String ogong = "오공";
		String saojeong = "사오정";
		String palgye = "저팔계";
		
		// 배열 (Array)
		// String [] 문자열 배열
		String [] seoyugi = new String[4]; // 첨자는 배열의 크기 (단순 Array 크기 변경 X)
		System.out.println(seoyugi.length); // 배열 길이를 리턴
		System.out.println(seoyugi[0]); // 처음 생성된 배열에는 기본값(Default)이 있음
		
		// 참조 타입 (String, Object..) : null
		// 기본 타입 (int, boolean..) : 숫자 = 0 // boolean = false
		int [] numbers = new int[3];
		System.out.println(numbers[0]);
		
		boolean [] bools = new boolean[5];
		System.out.println(bools[0]);
		
		
		seoyugi[0] = samjang;
		System.out.println(seoyugi[0]);
		seoyugi[1] = ogong;
		seoyugi[2] = saojeong;
		seoyugi[3] = palgye;
		
		System.out.println(seoyugi); // seoyugi 배열의 주소를 출력함..

		printArr(seoyugi);
		
		for(int i = 0; i < seoyugi.length; i++) {
			// 배열의 첫 요소에서 부터 순회하며 변경한다.
			seoyugi[i] = "서유기 " + seoyugi[i]; 
		}
	
		
		printArr(seoyugi);
		
		for(int i = 0; i < seoyugi.length; i++) {
		
			// 오공이 포함되어 있는 배열의 요소를 찾아서 서유기 -> 드래곤볼 로 변경한다.
			if(seoyugi[i].contains("오공")) {
				// '대상 문자열'.contains("찾을 문자열") <-- 포함되어 있으면 true
				seoyugi[i] = seoyugi[i].replace("서유기", "드래곤볼");
			}
		}
		
		
		printArr(seoyugi);
		
		String [] students = {"펭수", "길동", "동길", "길수"};
		// String [] students = new String {"펭수", "길동", "동길", "길수"}; 위와 동일하다.
		
		printArr(students);
		String subject = "Java, DB, JSP, HTML";
		// 대상문자열.split(구분자) <-- 구분자로 문자열을 잘라 배열에 저장하여 리턴.
		
		String [] subArr = subject.split(",");
		
		
		printArr(subArr);
		
		// 문자열 양쪽 공백제거
		for(int i = 0; i < subArr.length; i++) {
			subArr[i]= subArr[i].trim(); // trin <-- 양쪽 공백제거
		}
		
		
		printArr(subArr);
		
		// 배열의 복사
		// 1. 얇은 복사? shallow copy 주소값 복사
		String [] sinSeoyugi = seoyugi; // seoyugi의 주소가 복사 된것..
		printArr(sinSeoyugi);
		
		sinSeoyugi[0] = "강호동"; // 동일 주소이기 때문에 값 변경시에 두 변수가 모두 변경되어 있음
		printArr(seoyugi);
		printArr(sinSeoyugi);
		
		// 깊은 복사(Deep Copy) 새로운 객체 (주소가 서로 다름)
		String [] newSeoyugi = seoyugi.clone(); // 원본은 그대로 두고 다른주소에 같은 값을 재할당 한다고 생각
		newSeoyugi[2] = "은지원";
		printArr(sinSeoyugi); // 서로 값은 같지만 주소가 다르기 때문에 값 변경시 원본은 그대로 남아있음.
		printArr(newSeoyugi);
		
		// clone 까먹었다!?
		String [] copy = new String[seoyugi.length];
		for(int i = 0; i < seoyugi.length; i++) {
			copy[i]= seoyugi[i]; 
		}
		
		// @앞은 객체의 타입
		// @뒤에 붙은건 hashCode를 16진수로 나타낸 것
		System.out.println(seoyugi);
		System.out.println(seoyugi.hashCode());
		
		// 숫자를 16진수로 변환
		System.out.println(Integer.toHexString(seoyugi.hashCode()));
		
		
		// 해쉬(hash) 란?
		// 임의이 길이를 가진 데이터를 고정된 길이를 가진 데이터로 매핑한 것.
		// 이 과정에서 원본 데이터를 키(Key), 매핑하는 과정을 해싱(hashing)
		// 결과물로 나온 데이터를 해쉬 값(Hash Value)
		// 이렇게 데이터를 해싱하는 함수를 해시 함수(Hash Function) 이라고 함.
		String pw = "1234";
		String encode = encrypt(pw);
		System.out.println(encode);
		
		Scanner scan = new Scanner(System.in);
		while(true) {
		
			System.out.println("암호를 입력하시오!!");
			System.out.print(">>> ");
			String msg = scan.nextLine();
			String userPw = encrypt(msg);
			if(userPw.equals(encode)) {
				System.out.println("로그인 완료");
				break;
			}
			else {
				System.err.println("비밀번호가 틀림..");
			}
		}
		
		
		// 일차원 배열
		int [] oneD = {1,2,3};
		System.out.println(oneD[1]); // 2
		
		// 다차원 배열 2차원
		int [][] twoD = {{1,2,3}, {4,5,6}, {7,8,9} };
		
		System.out.println(twoD.length);
		// 만약 2라는 값에 접근 하려면?!
		System.out.println(twoD[0][1]);
		
		for(int i = 0; i<twoD.length; i++) {
				printArr(twoD[i]);
		}
		
		
		for(int i = 0; i<twoD.length; i++) {
			for(int j= 0; j<twoD[i].length; j++) {
				System.out.println(twoD[i][j]);
				/*
				 * [0][0], [0][1], [0][2]
				 * [1][0], [1][1], [1][2]
				 * [2][0], [2][1], [2][2]
				 * */
			}
		}
		
		// 3차원
		int [][][] threeD = {{{1,2,3}, {4,5,6}, {7,8,9}}, {{10,11,12}, {13,14}}};
		
		//만약 2라는 값에 접근 하려면?!
		System.out.println(threeD[0][0][1]);
		System.out.println(threeD[1][1][0]);
		
		
		
		
	}
	
	
	public static void printArr(String[] strArr) {
		for(int i = 0; i < strArr.length; i++) {
						if (i == strArr.length-1 ) {
				System.out.print(strArr[i]);
			}
			else {
				System.out.print(strArr[i] + ", "); // 인덱스로 접근할 시 값을 출력해줌	
			}
			
		}
		System.out.println("");
	}
	
	// int형 배열
	public static void printArr(int[] intArr) {
		for(int i = 0; i < intArr.length; i++) {
						if (i == intArr.length-1 ) {
				System.out.print(intArr[i]);
			}
			else {
				System.out.print(intArr[i] + ", "); // 인덱스로 접근할 시 값을 출력해줌	
			}
			
		}
		System.out.println("");
	}
	
	// 해쉬 암호화
	public static String encrypt(String text) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256"); // 암호화 기법(대표적인 방법)
		md.update(text.getBytes());
		
		return bytesToHex(md.digest());
		
	}

	private static String bytesToHex(byte[] bytes) {
		StringBuffer builder = new StringBuffer();
		for(byte b :bytes) {
			builder.append(String.format("%02x", b));
		}
		
		return builder.toString();
	}
	
	
	
}
