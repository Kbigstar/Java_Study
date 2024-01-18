package ch11_java_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;

import javax.net.ssl.HttpsURLConnection;

//JavaStudy - Bulid Path - Configure Bulid path
//classpath에 라이브러리 추가 (Json 읽기위해 json-simple-1.1.1.jar)
//order and export에 추가된 라이브러리 체크 후 apply
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiJson {
	
	
	public static void main(String[] args) throws IOException, ParseException {
		// 업비트 (OPEN) REST API 사용
		// https://docs.upbit.com/docs/upbit-quotation-restful-api
		String allUrl = "https://api.upbit.com/v1/market/all";
		
		// URL 클래스 사용 요청
		URL url = new URL(allUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		
		// 요청 방식 설정 (GET or POST)
		conn.setRequestMethod("GET");
		// 연결 타임아웃 설정
		conn.setReadTimeout(5000); // 5초
		conn.setDoOutput(true);
		
		// 응답에 따른 요청코드 리턴 200 -> 정상
		// 404..~ -> 실패 (비정상)
		int resCode = conn.getResponseCode(); 
		
		// 정상 응답일때 처리
		if (resCode == HttpsURLConnection.HTTP_OK) {
			System.out.println(resCode);

			// 실시간 스트리밍 데이터를 읽어오기
			BufferedReader in = 
					new BufferedReader((new InputStreamReader(conn.getInputStream())));
			
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			// 내용이 없을때 까지 버퍼에 담기
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response.toString());
			JSONParser parser = new JSONParser();
			// 응답 데이터의 구조가 처음 배열
			// JSON 데이터 형태로 문자열을 파싱 (json 데이터 규칙으로 읽어들여줌)
			JSONArray jsonArray = (JSONArray) parser.parse(response.toString());
			for(Object object: jsonArray) {
				// 응답데이터의 구조가 배열안에 객체 (key:value)형태로 담겨있음
				JSONObject jsonObj = (JSONObject) object;
//				System.out.println("market:" + jsonObj.get("market"));
//				System.out.println("kor:" + jsonObj.get("korean_name"));
//				System.out.println("en:" + jsonObj.get("english_name"));
			}
		}
		else {
			System.err.println(resCode);
		}
		

		
		getCoin("KRW-BTC");
		getCoin("KRW-ETH");
	}
	
	public static JSONObject getCoin(String code) throws IOException, ParseException {
		JSONObject obj = null;
		String detailUrl = "https://api.upbit.com/v1/ticker?markets=" + code;
		
		// URL 클래스 사용 요청
		URL url = new URL(detailUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		
		// 요청 방식 설정 (GET or POST)
		conn.setRequestMethod("GET");
		// 연결 타임아웃 설정
		conn.setReadTimeout(5000); // 5초
		conn.setDoOutput(true);
		
		// 응답에 따른 요청코드 리턴 200 -> 정상
		// 404..~ -> 실패 (비정상)
		int resCode = conn.getResponseCode(); 
		
		// 정상 응답일때 처리
		if (resCode == HttpsURLConnection.HTTP_OK) {
			System.out.println(resCode);

			//과학적 표기법으로 표현된 숫자 3.8515E7 <-- E에 오는 숫자는 10의 지수를 나타냄
			// 3.8515*10^7 을 의미함 따라서 실제값은 38515000 을 의미함
			DecimalFormat decimalFormat = new DecimalFormat("#");
			decimalFormat.setMaximumFractionDigits(0); // 소수점 이하 0으로
			
			
			// 실시간 스트리밍 데이터를 읽어오기
			BufferedReader in = 
					new BufferedReader((new InputStreamReader(conn.getInputStream())));
			
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			// 내용이 없을때 까지 버퍼에 담기
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response.toString());
			JSONParser parser = new JSONParser();
			// 응답 데이터의 구조가 처음 배열
			// JSON 데이터 형태로 문자열을 파싱 (json 데이터 규칙으로 읽어들여줌)
			

			JSONArray 	jsonArray = (JSONArray)parser.parse(response.toString());
			
			for(Object object: jsonArray) {
				// 응답데이터의 구조가 배열안에 객체 (key:value)형태로 담겨있음
				obj = (JSONObject) object;
				System.out.println("======== 현재 ========");
				System.out.println("market:" + obj.get("market"));
				System.out.println("trade_date : " + obj.get("trade_date"));
				System.out.println("trade_price : " + obj.get("trade_price"));
				System.out.println("trade_price : " + decimalFormat.format(obj.get("trade_price")));
			
			}
		}
		else {
			System.err.println(resCode);
		}
		
		
		return obj;
	}
	
	
}
