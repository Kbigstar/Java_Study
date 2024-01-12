package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MyPlayList {

	public static void main(String[] args) {
		ArrayList<String> playList = new ArrayList<>(Arrays.asList("비의 랩소디:임재현",
				"Perfect Night:LE SSERAFIM (르세라핌)", "To. X:태연 (TAEYEON)", "Drama:aespa", "사랑은 늘 도망가:임영웅", "첫 눈:EXO",
				"헤어지자 말해요:박재정", "인사:범진", "에피소드:이무진", "Do or Die:임영웅", "모래 알갱이:임영웅",
				"Seven (feat. Latto) - Clean Ver.:정국", "우리들의 블루스:임영웅",
				"그대만 있다면 (여름날 우리 X 너드커넥션 (Nerd Connection)):너드커넥션 (Nerd Connection)", "Baddie:IVE (아이브)",
				"다시 만날 수 있을까:임영웅", "이제 나만 믿어요:임영웅", "무지개:임영웅", "London Boy:임영웅", "아버지:임영웅", "Polaroid:임영웅",
				"Love Lee:AKMU (악뮤)", "I AM:IVE (아이브)", "You & Me:제니 (JENNIE)", "인생찬가:임영웅", "A bientot:임영웅",
				"Love 119:RIIZE", "Standing Next to You:정국", "연애편지:임영웅", "Get A Guitar:RIIZE", "후라이의 꿈:AKMU (악뮤)",
				"Super Shy:NewJeans", "너의 모든 순간:성시경", "사막에서 꽃을 피우듯:우디 (Woody)", "Ditto:NewJeans",
				"잘 지내자, 우리 (여름날 우리 X 로이킴):로이킴", "ETA:NewJeans", "Hype Boy:NewJeans", "퀸카 (Queencard):(여자)아이들",
				"별 떨어진다 (I Do):디오 (D.O.)", "어떻게 이별까지 사랑하겠어, 널 사랑하는 거지:AKMU (악뮤)", "사랑할 수밖에:볼빨간사춘기", "Discord:QWER",
				"Either Way:IVE (아이브)", "Smoke (Prod. Dynamicduo, Padi):다이나믹 듀오", "사랑인가 봐:멜로망스", "Dynamite:방탄소년단",
				"봄날:방탄소년단", "Off The Record:IVE (아이브)", "Merry PLLIstmas:PLAVE", "MANIAC:VIVIZ (비비지)", "Spicy:aespa",
				"사건의 지평선:윤하 (YOUNHA)", "Fast Forward:전소미", "사랑하지 않아서 그랬어:임한별", "음악의 신:세븐틴 (SEVENTEEN)",
				"그대가 내 안에 박혔다(그내박):순순희(기태)", "잠시라도 우리:성시경", "Kitsch:IVE (아이브)", "OMG:NewJeans", "취중고백:김민석",
				"이브, 프시케 그리고 푸른 수염의 아내:LE SSERAFIM (르세라핌)", "Steal The Show (From “엘리멘탈”):Lauv", "LOVE DIVE:IVE (아이브)",
				"Butter:방탄소년단", "심(心):DK(디셈버)", "파이팅 해야지 (Feat. 이영지):부석순 (SEVENTEEN)", "눈이 오잖아(Feat.헤이즈):이무진",
				"여섯 번째 여름:PLAVE", "그중에 그대를 만나:김호중", "물론:허각", "After LIKE:IVE (아이브)",
				"모든 날, 모든 순간 (Every day, Every Moment):폴킴", "I Don't Think That I Like Her:Charlie Puth",
				"Chill Kill:Red Velvet (레드벨벳)", "주저하는 연인들을 위해:잔나비", "Bubble:STAYC(스테이씨)", "손오공:세븐틴 (SEVENTEEN)",
				"해요 (2022):#안녕", "예뻤어:DAY6 (데이식스)", "I Love You:안세하", "화이트 (White):폴킴", "다정히 내 이름을 부르면:경서예지",
				"그대가 있는 곳, 언제 어디든:로이킴", "사랑..그게 뭔데:지아", "Dangerously:Charlie Puth", "GODS:NewJeans",
				"Attention:NewJeans", "UNFORGIVEN (feat. Nile Rodgers):LE SSERAFIM (르세라핌)", "한 페이지가 될 수 있게:DAY6 (데이식스)",
				"나에게 그대만이:탑현", "Dear. PLLI:PLAVE", "Closer Than This:지민", "3D (feat. Jack Harlow):정국",
				"I Love My Body:화사 (HWASA)", "기다릴게:PLAVE", "Yes or No:정국", "Snowman:Sia",
				"편지 한 장 (부제: 서른에 만난 첫 세상) (A letter):김호중", "I Just Love Ya:PLAVE"));
		
		//1.가수 리스트를 1줄에 5개씩 출력 
		//2.좋아하는 가수 이름을 입력받기 (q:종료)
		//3.해당 가수의 노래리스트 출력(순번도)
		//4.저장하고 싶은 노래의 순번을 입력받아 userMap에 저장
		     //ex 입력:  1, 4  
      		 //1, 4번 노래저장
		//5.현재까지 저장된 노래를 출력
		Scanner scan = new Scanner(System.in);
		HashMap<String, ArrayList<String>> userMap = new HashMap<>();
		main: while(true) {
			ArrayList<String> list = singerSet(playList);
			for(int i = 0 ; i < list.size(); i ++) {
				if(i%5==0) {
					System.out.println();
				}
				if(i == list.size()-1) {
					System.out.print(list.get(i));
				}else {
					System.out.print(list.get(i) + ",");
				}
			}
			System.out.println("\n==================== 나만의 플레이리스트 ====================");
			System.out.println("고객님의 닉네임을 입력해주세요");
			System.out.print(">>> ");
			String userNm = scan.nextLine();
			second:while(true) {
				
				int size = 0;
				if(userMap.containsKey(userNm)) {
					size = userMap.get(userNm).size();
					ArrayList<String> userArr =  userMap.get(userNm);
					System.out.println("user list------------------------------");
					for(String music:userArr) {
						System.out.println(music);
					}
					System.out.println("user list------------------------------");
				}
				System.out.println(userNm + "님의 플레이리스트는 "+size +"개 입니다.");
			
				System.out.println("\n---------------------------------------------------------");
				System.out.println("\n가수를 입력하세요(종료 q)>>>");
				String select = scan.nextLine();
				if(select.equals("q")) {
					System.out.println("시스템을 종료합니다.");
					break main;
				}
				ArrayList<String> arr = makeSongList(select, playList);
				if(arr.isEmpty()) {
					System.out.println("내용이 없습니다.");
				}else {
					third:while(true) {
						for(int i= 0; i < arr.size();i ++) {
							int no = i+1;
							System.out.println(no + "." + arr.get(i));
						}
						System.out.println("어떤 노래를 저장하시나요 ?(이전:n, 처음화면:f, 종료:q)");
						System.out.print(">>> ");
						String select2 = scan.nextLine();
						if(select2.equals("n")) {
							break third;
						}else if(select2.equals("q")) {
							System.out.println("시스템을 종료합니다.");
							break main;
						}else if(select2.equals("f")) {
							System.out.println("첫화면");
							break second;
						}
						int num = Integer.parseInt(select2) - 1;
						if(size == 0) {
							ArrayList<String> first = new ArrayList<>();
							first.add(select +":"+arr.get(num));
							userMap.put(userNm, first);
							size +=1;
						}else {
							userMap.get(userNm).add( select +":"+ arr.get(num));
						}
						System.out.println("저장되었습니다.");
					}
				}
			}
		}
	}
	
	public static ArrayList<String> singerSet(ArrayList<String> arr) {
		HashSet<String> singer = new HashSet<>();
		for (int i = 0; i < arr.size(); i++) {
			String[] temp = arr.get(i).split(":");
			singer.add(temp[1]);
		}
		ArrayList<String> list = new ArrayList<String>();
		for (String str : singer) {
			list.add(str);
		}
		return list;
	}
	public static ArrayList<String> makeSongList(String nm, ArrayList<String> arr){
		 ArrayList<String> result = new ArrayList<>();
		 for(int i = 0 ; i < arr.size(); i ++) {
			 String [] temp = arr.get(i).split(":");
			 // 입력받은 가수와 같으면 담기
			 if(nm.equals(temp[1])) {
				 result.add(temp[0]);
			 }
		 }
		 return result;
	}
}
