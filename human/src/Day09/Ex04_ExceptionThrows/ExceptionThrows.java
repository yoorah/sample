package Day09.Ex04_ExceptionThrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		try {
			// input() 메소드에서 예외를 떠넘겨서,
			// 호출한 곳에서 예외처리 해야함
			input();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.err.println("정수를 입력해주세요");
			
		}
		
	}
	
    // 
	//
	public static void input() throws InputMismatchException {
		
		
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		System.out.println(input);
		
	}
}
