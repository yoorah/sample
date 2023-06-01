package Day01;

import java.util.Scanner;


/**
 * 자바 기분 입출력
 * * 휴먼
 *
 */
public class Ex02_scanner {
	
	public static void main(String[] args) {
		// 객체 생성 - new
		// 클래스타입 클래스명 = new 클래스명();
		// 기분 입력 객체 - Scanner
		Scanner sc = new Scanner(System.in);    //  ctrl + shift + o
		// (경고)   - 노란색 밑줄루 퓨시
		//         - 경고가 발새해도 프로그램 실행가능
		// (에러)   - 빨산색 밑줄로 표시
		//         - 에러가 발생하면 실행 불가능
		
		// - 변수 선언
		// 자료형 변수명;
		// -변수 선언 및 초기화
		// 자료형 변수명 = 값;
		System.out.print("a : ");
		int a = sc.nextInt();     //nextInt() : 정수 하나를 입력받는 메소드
		
		// "문자열"   : 문자열 큰따옴표로 표현한다.
		// 문자열과 숫자 연결하기
		// : "문자열" + 변수(숫자)
		// - 문자열과 숫자를 +(문자열 연결 연산자)로 연결할 수 있다.
		//  이 때, 숫자(Int) 자료형이 문자열 자료형으로 변환되어 연결된다.
		// "a : " + a
		// "a : " +"10" --> "a : 10"
		System.out.println("a : " + a);
		
		// close : Scanner 객체를 닫는 (메모리 해재)
		sc.close();
		// Scanner 객체가 닫힌 후에는 입력을 할 수 없다.
		
	}
	

}










