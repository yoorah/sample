package Day02;

public class Ex17_For {
	
	public static void main(String[] args) {
		// for( 1주기식 ; 2조기식; 4증감식 ) { 3실행문; }
		// 실행 순서 : 1 → 반복(2 → 3 → 4)
		
		// 1-10 까지의 정수를 출력하시오.
		for (int i = 0; i < args.length; i++) {
				System.out.println(i + " ");
		}
		System.out.println();
		
		
		// 2. 50~100 까지의 정수를 출력사시오.
		for (int i = 50; i <= 100;  i++) {
			System.out.print(i +" ");
			
		}
		System.out.println();
		
		
		// 3. 1~20 까지 정수 중, 짝수만 출력하시오.
		// 2 4 6 .. 20
		for (int i = 2; i <= 20 ; i = i + 2 ) {
			System.out.print(i +" ");
			
		}
		System.out.println();
		
		
		// 4. 1-20 까지의 정수 중, 훌수만 출력하시오.
		// 1 3 5 .. 19
		for (int i = 1; i <= 20 ; i+=2) {
			System.out.print(i + " ");
			
		}
		System.out.println();
	
			
	}

}
