package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	
	private ArrayList<Movie> movieList = new ArrayList<Movie>();
	
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("내머리속에지우개", "이거 마시면 사귀는거다", "정우성", "ㄴㅁㄹㅅㅇㅈㅇㄱ"));
	}
	
	// 싱글톤 패턴
	private static MovieDB instance = new MovieDB();
	// 외부에서 접근
	public static MovieDB getInstance() {
		return instance;
	}
	
	public ArrayList<Movie> getMovieList() {
		return movieList;
	}
}
