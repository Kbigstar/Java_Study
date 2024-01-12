package ch09_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FutureMain {
	
	
	public static void main(String[] args) {
		
		ArrayList<FutureStudent> stuList = new ArrayList<>();
		stuList.add(new FutureStudent("강성준", "kang seongjun"));
		stuList.add(new FutureStudent("권보성", "kwon bosung"));
		stuList.add(new FutureStudent("권유빈", "kwon yubin"));
		stuList.add(new FutureStudent("김기찬", "kim gichan"));
		stuList.add(new FutureStudent("김대영", "kim daeyoung"));
		stuList.add(new FutureStudent("김동우", "kim dongwoo"));
		stuList.add(new FutureStudent("김동현", "kim donghyun"));
		stuList.add(new FutureStudent("김명기", "kim myeonggi"));
		stuList.add(new FutureStudent("김영주", "kim youngju"));
		stuList.add(new FutureStudent("김유정", "kim yujeong"));
		stuList.add(new FutureStudent("김은혜", "kim eunhye"));
		stuList.add(new FutureStudent("김휘건", "kim whgiun"));
		stuList.add(new FutureStudent("나항진", "na hangJin"));
		stuList.add(new FutureStudent("문성민", "moon seongmin"));
		stuList.add(new FutureStudent("박진기", "park jingi"));
		stuList.add(new FutureStudent("백현진", "back hyeonjin"));
		stuList.add(new FutureStudent("오정연", "oh jeongyeon"));
		stuList.add(new FutureStudent("유하영", "yoo hayoung"));
		stuList.add(new FutureStudent("이예진", "lee yejin"));
		stuList.add(new FutureStudent("이용빈", "lee yongbin"));
		stuList.add(new FutureStudent("정유진", "jung yujin"));
		
		System.out.println(stuList);
		
		
		System.out.println("======== 미래융합교육원 4기 시작! ========");
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) + "일차 ========");
			for(FutureStudent stu: stuList) {
				stu.endDay();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// level기준 내림차순 정렬
		// -> 는 람다식
//		Collections.sort(stuList, (stuA, stuB) -> 
//									stuB.getLevel() - stuA.getLevel());
		
		// level 내림차순, exp 내림차순
		Collections.sort(stuList, (stuA, stuB) ->{
			// 먼저 level에 대해 비교
			int levelCompare = stuB.getLevel() - stuA.getLevel();
			if (levelCompare != 0) {
				return levelCompare;
			}
			// level이 같다면, exp에 대해 비교함.
			return stuB.getExp() - stuA.getExp();
		});
		
		
		// Collections.sort 메서드는 두 가지 파라미터를 받음
		// 여기에서 (stuA, stuB) 두 학생 객체를 비교
		//stuB.getLevel() - stuA.getLevel() stuB학생과 stuA학생의 값이
		// 양수이면 stuB가 stuA보다 높은 레벨로 간주됨. 리스트에서 stuB가 stuA보다 앞에 위치됨.
		// 만약 stuA - stuB라면 오름차순으로 정렬됨.
		
		// 등수 출력
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등." + stuList.get(i));
		}
		
		
		// 출력
//		for(FutureStudent stu: stuList) {
//			System.out.println(stu);
//		}
		
	}
	
	
}
