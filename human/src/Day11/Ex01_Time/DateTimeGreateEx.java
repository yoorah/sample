package Day11.Ex01_Time;

import java.time.*;
import java.util.TimeZone;

public class DateTimeGreateEx {
	
	public static void main(String[] args) {
		
		// LocalDate : 날짜를 다루는 클래스
		LocalDate nowDate = LocalDate.now();
		System.out.println("현재 날짜 : " + nowDate);
		
		
		LocalDate endDate = LocalDate.of(2023,  10, 26);
		System.out.println("종료 날짜 : " + endDate);
		
		// LocalDate : 시간을 다루는 클래스
		LocalTime nowTime = LocalTime.now();
		System.out.println("현재 시간 : " + nowTime);
		
		// LocalTime.of( 시간, 분, 초, 나노초 )  
		LocalTime endTime = LocalTime.of(17, 40,0, 0);
		System.out.println("종료 시강 : " + endTime);
		
		// LocalDateTime : 날짜를/시간 다루는 클래스
		LocalDateTime nowDateTime = LocalDateTime.now();
	    System.out.println("현재 날짜와 시간 : " + nowDateTime);
	    
	    
	    LocalDateTime endDateTime = LocalDateTime.of(2023, 10, 26, 17, 40, 0, 0);
	    System.out.println("현재 날짜와 시간 : " + endDateTime);
	    
	    // 협정 세계 타임준 (TimeZone)
	    // UTC : 협정 세계시 - 국체 표준시
	    // 서울 : Asia/Seoul
	    // 뉴욕 : America/New_York
	    // 일분 : Japan
	    // 로마 : Europe/Rome 
	    
	    ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
	    System.out.println("협정 세계시 : " + utcDateTime);
	    
	    ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
	    System.out.println("서울 표준시 : " + seoulDateTime);
	    
	    ZonedDateTime newYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
	    System.out.println("뉴욕 표준시 : " + newYorkDateTime);
	    
	    ZonedDateTime japanDateTime = ZonedDateTime.now(ZoneId.of("Japan"));
	    System.out.println("일본 표준시 : " + japanDateTime);
	    
	    ZonedDateTime romeDateTime = ZonedDateTime.now(ZoneId.of("Europe/Rome"));
	    System.out.println("로마 표준시 : " + romeDateTime);
	    
	    // 윤년
	    // 2월 29일
	    LocalDate ld = LocalDate.now();
	    // LocalDate.isLeapYear () : 유년이면 true, 아니면 false 를 반환하는 메소드
	    
	    if (ld.isLeapYear()) {
	    	System.out.println("올해는 윤년 : 2월 29일까지");
	    }
	    else {
	    	System.out.println(" 올해는 평년 : 2월 28일까지");
	    }
	    
	    // 사용가는한 타임존 아이디
	    String[] timeZoneId = TimeZone.getAvailableIDs();
	    
        for (String ZoneId : timeZoneId) {
        	System.out.println(ZoneId);
			
		}
			
		}
	   
	    

		
	}


