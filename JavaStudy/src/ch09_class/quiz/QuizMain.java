package ch09_class.quiz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizMain {
	
	
	public static void main(String[] args) {
		
		// 외부에서 new 할 수 없고
		// 내부에서 생성되어진 하나의 인스턴스만을 사용 함.
		MovieDB movieDB1 = MovieDB.getInstance();
		MovieDB movieDB2 = MovieDB.getInstance(); // 1, 2 같은 인스턴스 
		
		// movieList 메서드는 가져온 인스턴스로만 호출 가능하다.
		ArrayList<Movie> movieList = movieDB1.getMovieList();
		
		// 영화 맞추기
		// 1. 명대사출력
		// 2. 못맞추면 배우 출력
		// 3. 못맞추면 초성 출력
		// 못맞추면 다음 영화로 넘어감
		Collections.shuffle(movieList); // 랜덤으로 섞음.
		
		int score = 0;
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i).getQuotes());
			System.out.print(">>> ");
			
			String answer = scan.nextLine();
			
			if (answer.equals(movieList.get(i).getTitle())) {
				System.out.println("정답 입니다!");
				score += 3;
				continue;
			}
			
			System.out.println(movieList.get(i).getActor());
			System.out.print(">>> ");
			answer = scan.nextLine();
			
			if (answer.equals(movieList.get(i).getTitle())) {
				System.out.println("정답 입니다!");
				score += 2;
				continue;
			}
			
			System.out.println(movieList.get(i).getWord());
			System.out.print(">>> ");
			answer = scan.nextLine();
			
			if (answer.equals(movieList.get(i).getTitle())) {
				System.out.println("정답 입니다!");
				score += 1;
				continue;
			}
			
			System.out.println("땡 ! 이번 영화는 틀렸습니다 다음문제로 넘어갑니다..!");
		}
		
		System.out.println("점수는 : " + score);
		
	}
	
	
}
