package Day03;

import java.util.Scanner;

public class Ex03_Min {
	
	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최댓값을 구하여 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
	
		int max = Integer.MIN_VALUE;	// int 타입의 최솟값 : -21억xxx
		for (int i = 0; i < arr.length; i++) {
			// 6. 두 요소 중 더 큰 요소를 변수 max 에 대입한다
			if( min > arr[i];
				min = arr[i];
			
		}
		
	
		System.out.println("최댓값 : " + min);
		sc.close();
	}

}



