package ch09_class;

public class FutureStudent {
	
	// 전역 변수를 사용하려면 클래스 수준에서 static(정적) 필드를 선언해야함
	private static int cnt = 1;
	
	// 학생
	private int stuId;
	private String korNm;
	private String engNm;
	private int level;
	private int exp;

	// 생성자 [Shift + alt + s]
	public FutureStudent(String korNm, String engNm, int level, int exp) {
		super();
		this.stuId = cnt;
		this.korNm = korNm;
		this.engNm = engNm;
		this.level = level;
		this.exp = exp;
		cnt++;
	}
	
	public FutureStudent(String name, String enName) {
		this(name, enName, 1, 0);
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getKorNm() {
		return korNm;
	}

	public void setKorNm(String korNm) {
		this.korNm = korNm;
	}

	public String getEngNm() {
		return engNm;
	}

	public void setEngNm(String engNm) {
		this.engNm = engNm;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public static int getCnt() {
		return cnt;
	}

	@Override
	public String toString() {
		return "미래융합 학생 [stuId=" + stuId + ", korNm=" + korNm + ", engNm=" + engNm + ", level=" + level + ", exp="
				+ exp + "]";
	}
	
	
	// 하루가 지나는 이벤트 메소드
	public void endDay() {
		
		// 20 ~ 60 랜덤
		int rand = (int)((Math.random() * 41) +20);
		exp += rand;
		System.out.println(this.korNm + " 씨의 현재 경험치 : " + exp);
		if (exp >= 100) {
			System.out.println("레벨업!!!");
			level++;
			System.out.println(korNm + " 씨의 현재 레벨 : " + level );
			exp -= 100;
		}
		
	}
	
}
