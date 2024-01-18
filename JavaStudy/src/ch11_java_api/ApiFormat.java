package ch11_java_api;

import java.text.DecimalFormat;

public class ApiFormat {

   public static void main(String[] args) {
      // 숫자형식 DecimalFormat
      // 자릿수에 맞춰 숫자 앞에 0붙이기(코드값 필요할때 사용)
      DecimalFormat format = new DecimalFormat("00000");
      System.out.println(format.format(1));
      System.out.println(format.format(1123));
      System.out.println(format.format(99999));
      // 소수 뒤에 0붙이기
      DecimalFormat format2 = new DecimalFormat("0.000");
      System.out.println(format2.format(12.1));
      System.out.println(format2.format(12.12));
      // 천 단뒤마다 , 붙이기
      DecimalFormat format3 = new DecimalFormat("0,000");
      System.out.println(format3.format(1000000));
      System.out.println(format3.format(123400000));

   }

}