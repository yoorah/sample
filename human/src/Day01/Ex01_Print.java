package Day01;

// 프로그램 실행 : ctrl + F11
public class Ex01_Print {
	
	//main : ctrl + space
	public static void main(String[] args) {
		// 기본 출력문
		// - print(), println() 메소드를 호출하여 출력한다.
		// - System.out 출력 스트림 객체를 사용한다.
		
		// print("문자열");
		// : 지정한 "문자열"을 출력하는 메소드
		System.out.print("안녕하세요 출력\n");
		// \n : 줄바꿈 문자
		
		
		// println();		- ln(line)
		// : 지정한 "문자열"을 출력하고 한 줄을 줄바꼼(엔터)해주는메소드
		System.out.println("안녕하세요 출력 후 줄바꼼");
		
		System.out.println("자바 첫 수업...");
		System.out.println();
		System.out.println("이어지는 문자열...");
	}

}
