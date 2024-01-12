package practice;


public class Result05 {

	
	public static void main(String[] args) {

		// 문제 1
		BusinessCard("권보성", "010-4915-1208", "127897@naver.com");
		
		// 문제 2
		String[] nameList = { "강성준", "권보성", "권유빈", "김기찬", "김대영", "김동우", "김동현", "김명기", "김영주", "김유정", "김은혜", "김휘건", "나항진",
				"문성민", "박진기", "백현진", "오정연", "유하영", "이예진", "이용빈", "정유진", };
		SearhName("김", nameList);
		
		// 문제 3
		int [] intArr = { 23, 456, 213, 32, 464, 1, 2, 4};
		MinMax(intArr);
	}

	
	public static void BusinessCard(String name, String phoneNum, String email) {
		System.out.println("========================");
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + phoneNum);
		System.out.println("이메일 : " + email);
		System.out.println("========================");
	}
	
	public static void SearhName(String firstName ,String[] nameList) {
		int count = 0;
		String [] tmp = new String[nameList.length];
		
		for(int i = 0; i < nameList.length; i++) {
			if(nameList[i].startsWith(firstName)) {
				tmp[count] = nameList[i]; 
				count++;
				
			}
			
		}
		System.out.println("========================");
		System.out.println(firstName + "씨 성을 가진 동기분이 총 " + count + "명 있습니다.");
		for(int i = 0; i < tmp.length; i++) {
			if (tmp[i] != null) {
				System.out.print(tmp[i]+"씨 ");	
			}
				
		}
		System.out.println();
		System.out.println("========================");
		
	}
	
	public static void MinMax(int[] Arr) {
		int min = Arr[0];
		int max = Arr[0];
		
		
		for(int i = 0; i < Arr.length; i++) {
			
			if (Arr[i] > max) {
				max = Arr[i];
			}
			if (Arr[i] < min) {
				min = Arr[i];
			}
			
		}
		
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
	
}