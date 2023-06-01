package Day10.Ex02_Lang;

import java.util.Iterator;

public class MathEx {
	
	public static void main(String[] args) {
		System.out.println(Math.PI);              // 3.141592653589793 (원주율)
		System.out.println(Math.ceil(3.125));     // 올림 : 해당 수보다 큰 정수 중 가장 작은 수
		System.out.println(Math.floor(3.75));     // 내림 : 해당 수보다 자근 정수 중 가장 큰 수
		System.out.println(Math.sqrt(9));         // 제곱근(루트)
		System.out.println(Math.pow(3,2));        // 3의 2제곱
		System.out.println(Math.exp(2));          // e의 2승
		System.out.println(Math.round(3.14));     // 반올림
		
		System.out.println("------------------");
		
		// 로또 번호6/45
		// [1,45] 사이의 정수형 난수 6개 만들기
		// Math.random()         : 0.0 보다 크기가 같고 1.0 보다 작은 임의의 실수 반환
		// Math.random()         : 0.xxx ~ 0.9xx
		// (0.xxx ~ 0.9xx) * 10  : 0.xxx ~ 9.xxx  (0 ~ 9) -10개
		// (0.xxx ~ 0.9xx) * 20  : 0.xxx ~ 19.xxx  (0 ~ 19) -20개
		// (0.xxx ~ 0.9xx) * 45  : 0.xxx ~ 44.xxx  
		// (0.xxx ~ 0.9xx) * 45+1  : 1.xxx ~ 45.xxx  
		// (int) (Math.random() * 45 + 1 )   : 1 ~ 45
		
		// [공식]
		// (int) ( Math.random(() * [개수] + [시작숫자];
		for (int i = 0; i < 6; i++) {
		int random = (int) (Math.random() * 45 + 1);
        System.out.println( random + " ");
		}
		System.out.println();
		
		// -50~-1 (50)
		// 0 (1개)
		// +1~+50 (50개)
		// -50 ~ 50 사이의 랜덤 수를 1 개 출력하시오.
		int random = (int) (Math.random() * 101 - 50);
		System.out.println(random);
		
	
	}
		
	
		
		
	    
	    
	}


