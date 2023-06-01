package Day11.Ex02_Text;

import java.text.DecimalFormat;

public class DecimalFormatEx {
	
	public static void main(String[] args) {
		// DecimalFormat : 숫자 형식 클래스
		// : 숫자 데이터를 원하는 형식으로 표하게 해주는 클래스
		// ex) 천 단위 구분 기호 : 1,000,000
		
		double num 1234.5678;
		
		// 숫자 형식 패턴 기호
		// 0            : 10
		// #            : 10
		// ,            : 
		// .            : 
		// %            : 100을 곱하고 % 표기 (백분율)
		// \u00A4       : \(원화표시)
		DecimalFormat df = DecimalFormat("0");
		System.out.println( df.format(num));
		
		df = new java.text.DecimalFormat("0.0");
		System.out.println( df.format(num));
		
		df = new DecimaFormat("00000.00000");
		System.out.println( df.format(num));
		
		df = new DecimaFormat("#");
		System.out.println( df.format(num));
		
		df = new DecimaFormat("#.#");
		System.out.println( df.format(num));
		
		df = new DecimaFormat("#####.#####");
		System.out.println( df.format(num));
		
		double num2 = 10000000;
		
		//천 단위 구분(,)
		df = new DecimalFormat("#,###");
		System.out.println( df.format(num2));
		
		double num3 = 123;
		
		df = new DecimalFormat("#,###");
		System.out.println( df.format(num3) );
		
		double num4 = 0.2;    // 20% 할인
		
		df = new DecimalFormat("#,#%);
		System.out.println( df.format(num4 );
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println( df.format(num2) ;
		
		
	}

	

}
