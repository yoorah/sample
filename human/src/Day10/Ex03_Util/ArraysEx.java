package Day10.Ex03_Util;

import java.util.ArraysEx

public class ArraysEx.java
	
	public static void main(String[] args) {
		
		// 정렬되지 않은 배열요소들
		int[] arr = {5, 3, 4, 1, 2};
		
		// 배열을 정렬(sort) - 오름차순
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 100 개의 랜덤 수를 배열요소로 갖는 배열
		int[] random = new int[100];
		
		// 1 ~ 100 사이의 랜덤 수 100개를 배열에 넣는다
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 100 + 1);
		}
		
		Arrays.sort(random);
		
		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + " ");
		}
		System.out.println();
		
		// 이진 검색(탐색) 알고리즘을 사용하여 검색한 후,
		// 해당 값이 있으면, 그 위치(index)를 반환
		// 찾지 못했으면, ( -(insertion point) -1 ) 음수를 반환
		// - 반환 값 : -(찾는 값이 있어야하는 위치) -1
		if( Arrays.binarySearch(random, 10) < 0 ) {
			System.out.println("랜덤 수 10이 없습니다.");
		}
         //		else {
			System.out.println("index : " + Arrays.binarySearch(random, 10));
         //		}
		
		
		// Arrays.fill(값)		: 값으로 모든 배열요소를 채우는 메소드
		int fill[] = new int[10];
		
		Arrays.fill(fill, 6);
		
		for (int i = 0; i < fill.length; i++) {
			System.out.print(fill[i] + " ");
		}
		System.out.println();
		
		// Arrays.copyOf(배열, 길이);
		// : 배열을 앞에서부터 (길이)개의 요소를 복사하여 배열로 반환
		int copy[] = Arrays.copyOf(fill, 3);
		// 6 6 6 6 6  6 6 6 6 6
		// 6 6 6 을 복사 해옴
		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// Arrays.copyOfRange(배열, 시작index, 끝index+1)
		int copyRange[] = Arrays.copyOfRange(arr, 2, 4);
		// 1 2 3 4 5
		// 3 4 를 복사해옴
		
		for (int i = 0; i < copyRange.length; i++) {
			System.out.print
			(copyRange[i] + " ");
		}
		System.out.println();
		
	}

}





