package Day11.Ex02_Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
	
	public static void main(String[] args) throws ParseException {
		/*
		      yyyy : 4자리 년도,  yy  : 2자리 년도
		      MM   : 2자리월,     M   : 1자리 월
		      dd   : 2자리,       d  : 1자리 일 (1~9)
		      D    : 올해의 몇 번 째 일 
		      d    : 올해의 몇 주가
		      D    : 올해의 몇 번 째 일
		      w    : 올해의 몇
		      W    :
		      E    :
		      a    :  
		      HH   :  시
		      mm   :  분
		      ss   :  초
		      */
	   Date now = new Date();
	   SimpleDateFormat sdf = new SimpleDateFormat();
	   System.out.println(  sdf.format(now));
	   
	   String day = "2023/05/01";
	   Date date = new SimpleDateFormat("yyyy/MM/dd").parse(day);
	   sdf = new SimpleDateFormat("yyyy/M/d");
	   System.out.println( sdf.format(date));
   
	   sdf= new SimpleDateFormat("yyyy년 MM월 dd일");
	   System.out.println( sdf.format(now));
	   
	   
	   
	   
	}

}
