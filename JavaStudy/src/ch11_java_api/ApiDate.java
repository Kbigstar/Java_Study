package ch11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiDate {

	public static void main(String[] args) {

		// 1. Date 클래스
		// 1970년 1월 1일 자정(UTC) 이후의 시간을 밀리초 단위로 표현
		Date dateToday = new Date(); //java.util.Date;
		System.out.println(dateToday);
		
		// 원하는 포멧 형태로 만들 수 있음. 단 yyyy 같은 고정 표현을 사용하여
		// ex) MM -> 월  mm -> 분 대소문자 주의
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strToday = sdf.format(dateToday);
		System.out.println(strToday);
		
		// 2024-01-17 을 출력하시오
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String strToday2 = sdf2.format(dateToday);
		System.out.println(strToday2);
		
		// 뉴욕 시간
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		sdf3.setTimeZone(timeZone);
		String newYork = sdf3.format(dateToday);
		System.out.println(newYork);
		
		String strDinner = "2024-01-18 18:10:00";
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dinner = null;
		try {
			dinner = sdf.parse(strDinner);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println(dinner);
		}
		
		//
		System.out.println(dateToday.getTime());
		System.out.println(dinner.getTime());
		long diffMillSec = dinner.getTime() - dateToday.getTime();
		System.out.println(diffMillSec + "밀리초 남음");
		System.out.println(diffMillSec / 1000 + "초 남음");
		System.out.println((diffMillSec / 1000 / 60) + "분 남음");
		System.out.println((diffMillSec / 1000 / 60 / 60) + "시간 남음");
		
		// Calendar 클래스 (YEAR, MONTH.. 와 같은 필드를 제공) 날짜계산 조작에 유용함.
		// 1일 뒤 한달 뒤 와 같은..
		Calendar calToday = Calendar.getInstance();
		System.out.println(calToday.getTime());
		System.out.println(calToday.get(Calendar.YEAR));
		System.out.println(calToday.get((Calendar.MONTH) + 1));
		System.out.println(calToday.get(Calendar.DATE));
		System.out.println(calToday.get(Calendar.HOUR_OF_DAY));
		
		// 3일 뒤
		calToday.add(Calendar.DATE, 3);
		System.out.println(sdf.format(calToday.getTime()));
		
		// 10일 전
		calToday.add(Calendar.DATE, -10);
		System.out.println(sdf.format(calToday.getTime()));
		
		// 5개월 뒤
		calToday.add(Calendar.MONTH, 5);
		System.out.println(sdf.format(calToday.getTime()));
		
		// 달력 만들기
		Calendar calendars = Calendar.getInstance();
		int year = 2024;
		int month = 1;
		calendars.set(year, month-1, 1); // 해당 월 1일 날짜
		// 해당 월의 마지막 일자 얻기
		int lastDay = calendars.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		// 해당 월의 시작 요일
		// 1 : 일요일, 2 : 월요일
		int startDay = calendars.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay);
		
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int current = 1;
		
		for(int i = 1; i <= 42; i++) {
			if (i < startDay) {
				System.out.print("\t");
			}

			else {
				if (i % 7 == 0 || i % 7 == 1) {
					System.err.printf("%d\t", current);	
				}
				else {
					System.out.printf("%d\t", current);	
				}
				
				current++;
				if(current > lastDay) {
					break;
				}
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		workingCalender(2024, 2);
		workingCalender(2024, 3);
		workingCalender(2024, 4);
		workingCalender(2024, 5);
	}
	
	public static void workingCalender(int year, int month) {
		Calendar calendars = Calendar.getInstance();
		
		calendars.set(year, month-1, 1);

		int lastDay = calendars.get(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		int startDay = calendars.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay);
		
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int current = 1;
		
		for(int i = 1; i <= 42; i++) {
			if (i < startDay) {
				System.out.print("\t");
			}

			else {
				System.out.printf("%d\t", current);	
				current++;
				
				if(current > lastDay) {
					break;
				}
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	}
	
	
	
	
	
}
