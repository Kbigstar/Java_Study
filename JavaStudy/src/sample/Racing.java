package sample;

public class Racing {

		public static void main(String[] args) {
		
			String lane1 = "1. ";
			String lane2 = "2. ";
			String lane3 = "3. ";
			String lane4 = "4. ";
			String lane5 = "5. ";
			String lane6 = "6. ";
			
			while(true) {
				// 확률에 따른 전진
				// Math.random() 은 0~1사이의 랜덤 소수 리턴
				// random에 0~7 중 랜덤한 숫자가 담기도록 한다.
				// Math 는 수학관련 함수가 담겨있는 라이브러리 임
				int random = (int) (Math.random() * 8 );
				
				// 1/8 확률 
				if(random == 1) {
					lane1 += "=";
				}
				else if(random == 2) {
					lane2 += "=";
				}
				else if(random == 3) {
					lane3 += "=";
				}
				else if(random == 4) {
					lane4 += "=";
				}
				else if(random == 5) {
					lane5 += "=";
				}
				else if(random == 6) {
					lane6 += "=";
				}
				
				// 콘솔창에 줄바꿈을 20번 하여
				// 기존 텍스트가 보이지 않게 함.
				for(int i = 0; i < 20; i++) {
					System.out.println();
				}
				
				System.out.println(lane1 + "🐎");
				System.out.println(lane2 + "🐎");
				System.out.println(lane3 + "🐎");
				System.out.println(lane4 + "🐎");
				System.out.println(lane5 + "🐎");
				System.out.println(lane6 + "🐎");
				
				// 결승선 통과 처리
				if(lane1.length() == 40) {
					System.out.println("1번 승리!!");
					break;
				}
				else if(lane2.length() == 40) {
					System.out.println("2번 승리!!");
					break;
				}
				else if(lane3.length() == 40) {
					System.out.println("3번 승리!!");
					break;
				}
				else if(lane4.length() == 40) {
					System.out.println("4번 승리!!");
					break;
				}
				else if(lane5.length() == 40) {
					System.out.println("5번 승리!!");
					break;
				}
				else if(lane6.length() == 40) {
					System.out.println("6번 승리!!");
					break;
				}
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 0.1초 딜레이
			}
			
		}
		
}
