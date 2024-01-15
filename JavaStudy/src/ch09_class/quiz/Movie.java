package ch09_class.quiz;


// VO(Value Object)
// DTO(Data Transfer Object)
public class Movie {	
	
	private String title; // 영화제목
	private String quotes; // 명대사
	private String actor; // 배우
	private String word; // 초성
	
	public Movie(String title, String quotes, String actor, String word) {
		//super();
		this.title = title;
		this.quotes = quotes;
		this.actor = actor;
		this.word = word;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", quotes=" + quotes + ", actor=" + actor + ", word=" + word + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuotes() {
		return quotes;
	}

	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	
	
	
}
