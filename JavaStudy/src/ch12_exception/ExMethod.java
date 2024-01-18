package ch12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExMethod {
	public static void printName(String nm) throws BizException {
		// 코드상 오류는 아니지만 해당 업무에서는 오류로 보는 상황에 대한 예외처리 방법
		if (nm.length() == 0) {
			throw new BizException("001", "이름에 empty가 들어옴!");
		}
		else if(nm.length() == 1) {
			throw new BizException("002", "외자는 안됨!!");
		}
	}

	public static long dataMillSec(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp= sdf.parse(date);
		return temp.getTime();
	}
	
	public static long dateMillSec2(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp;
		long result = 0l;
		try {
			temp= sdf.parse(date);
			result = temp.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
