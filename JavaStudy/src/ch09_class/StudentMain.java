package ch09_class;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		Student pangsu = new Student("펭수"); // new Class 인스턴스화 (객체 생성!) 
		Student nick = new Student("nick");
		
		System.out.println(pangsu.getName());
		System.out.println(nick.getName());
		nick.check();
		
		Student judy = new Student("주디", 100, 90, 80);
		Student jack = new Student("짹", 80, 99 ,70);
		
		System.out.println(judy.getKor());
		
		ArrayList<Student> stuList = new ArrayList<>();
		stuList.add(judy);
		stuList.add(jack);
		
		System.out.println(judy.getAvg());	
		System.out.println(jack.getAvg());		
		
		
		// toString()이 없으면 내용물을 알 수 없다.. 
		// toString() 없으면 이렇게 나옴 ch09_class.Student@43a25848
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		judy.setKor(50);
		System.out.println(judy);
		
	}

	
	
	
	
}