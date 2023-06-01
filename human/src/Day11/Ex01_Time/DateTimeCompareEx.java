package Day11.Ex01_Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareEx {

	public static void main(String[] args) {
		// 
		LocalDateTime todayDateTime = LocalDateTime.of(2023, 05, 01, 12, 0, 15);
		System.out.println("오늘 : " + todayDateTime);
		
		//
		LocalDateTime endDateTime = LocalDateTime.of(2023, 10, 26, 17, 40 ,0);
		System.out.println("종강 : " + todayDateTime);
		
		//
		//
		//
		
		if ( todayDateTime.isBefore(endDateTime) ) {
			System.out.println("훈ㄴ련관정 진행 중");
			
		}
		else if ( todayDateTime.isEqual(endDateTime) ) {
			System.out.println("종강");
		}
		else if( todayDateTime.isAfter(endDateTime) ) {
			System.out.println("훈련과정 종료");
			
		}
		
		//
		//
		//
		long remainYear = todayDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = todayDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = todayDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = todayDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = todayDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = todayDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 년도 : " + remainMonth);
		System.out.println("남은 년도 : " + remainDay);
		System.out.println("남은 년도 : " + remainHour);
		System.out.println("남은 년도 : " + remainMinute);
		System.out.println("남은 년도 : " + remainSecond);
		System.out.println();
		
	
	    // between()
	    // -ChronoUnit.상수.between(시작일자, 종료일자)
		// : 시작일자 종료일자의 남은 시가을 지정한 상수 단위에 맞게 변환하는 메소드
		 remainYear = ChronoUnit.YEARS.between(todayDateTime, endDateTime );
		 remainMonth = ChronoUnit.MONTHS.between(todayDateTime.endDateTime );
		 remainDay = ChronoUnit.DAYS.between(todayDateTime.endDateTime );
		 remainHour = ChronoUnit.HOURS.between(todayDateTime.endDateTime );
		 remainMinute = ChronoUnit.MINUTES.todayDateTime.endDateTime );
		 remainSecond = ChronoUnit.SECONDS.todayDateTime.endDateTime );
		
		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 년도 : " + remainMonth);
		System.out.println("남은 년도 : " + remainDay);
		System.out.println("남은 년도 : " + remainHour);
		System.out.println("남은 년도 : " + remainMinute);
		System.out.println("남은 년도 : " + remainSecond);
		System.out.println();
		}
	
}
