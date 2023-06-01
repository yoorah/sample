package Day02;

public class Ex05_TrenaryOperator {
	
 
	public static void main(String[] args) {
		int a = 3, b = 5;
		
		// a 와 b 두 수의 차이를 구하세요.
		// a - b = -2
		// b - a = 2
		// 주건 연산자 (삼한 연산자)
		// (주건) ? : (참일 때 문장) : (거짓일 때 문장)
		int result = (a > b) ? a-b : b-a;
		System.out.println("두 수의 차 : "+ result);
			
	 
	}

}
