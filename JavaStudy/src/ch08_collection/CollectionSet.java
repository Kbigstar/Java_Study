package ch08_collection;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionSet {
	
	
	public static void main(String[] args) {
		
		// Set 중복을 혀용하지 않음.
		HashSet<String> stuSet = new HashSet<>();
		
		// .add(값)
		stuSet.add("팽수");
		stuSet.add("팽순");
		stuSet.add("팽수");
		System.out.println(stuSet);
		
		// .size()
		System.out.println(stuSet.size());
		
		// set은 순서 정보가 없음
		for(String stu: stuSet) {
			System.out.println(stu);
		}
		
		//Iterator 사용
		Iterator<String> iterator = stuSet.iterator();
		
		while(iterator.hasNext()) {
			String nm = iterator.next();
			System.out.println(nm);
		}
		
		
	}
	
	
}
