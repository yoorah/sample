package Day09.Ex01_TryCatch;

public class NumberFormat {
	
	public static void main(String[] args) {
		// "10"  문자열 숫자를 정수타입으로 변환 가능
		// "a10" 이러한열은 정수타입이로 변환 불가
		String numberString = "10";
		String numberAndString = "a10";
		
		// Integer.parentInt("문자열숫자")
		// : 문자열 숫잘를 int 타입의 정수로 변환하는 메소드
		int num1 = Integer.parseInt(numberString);  // 변환가능
		int num2 = 0;
		
		// 예외 메시지 : java.lang.NumberFormatException: For input string: "a10"
	    try {
			num2 = Integer.parseInt(numberAndString);    // 변환 불가
		} catch (Exception e) {
			System.err.println("문자열숫자가 아닌 문자열은 숫자타입으로 변화할 수 없습니다.");
			
		}
		
		
		System.out.println("num1 : " + (num1+10) );
		System.out.println("num2 : " + num2);
 	}

}
