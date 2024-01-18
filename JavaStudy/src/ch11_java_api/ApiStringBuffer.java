package ch11_java_api;

public class ApiStringBuffer {

   public static void main(String[] args) {
      
      
      
      String a = "길동";
      System.out.println(a.hashCode());
      a = "팽수";
      System.out.println(a.hashCode());
      // Java에서 불변(immutable) 가변(mutable)
      // 블변변수는 한번 초기화되면 그값이 변경되지 않음
      // String은 불변
      
      // 가변변수는 선언된 후에도 그 값이 변경될 수 있음
      // int, ArrayList... 가변변수
      // String은 불변객체로 값을 계속 수정하게되면
      // 메모리 영역에 매번 새로운 String 객체가 만들어지고 그로인해 기비지컬렉터(메모리관리)
      // 에서 할일이 많아짐(비효율적)
      // 그래서 변경이 많다면 StringBuffer 클래스 사용
      
      StringBuffer strBuffer=new StringBuffer();
      strBuffer.append("hi");
      System.out.println(strBuffer);
      strBuffer.append(" hello");
      // 문자열 가져오기
      String str = strBuffer.toString();
      System.out.println(str);
   }

}