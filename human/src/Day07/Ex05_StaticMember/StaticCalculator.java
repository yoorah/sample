package Day07.Ex05_StaticMember;

class Calculator2 {


	// 아래의 연산 결과를 메소드를 정의하시오.
	// 1. 절댓값
	// 2. 최댓값
	// 3. 최솟값
	
    public static int abs(int val) {
    	return val >  0 ? val : -val;
    	
	}
     
    public static int max(int arr[]) {
    	int max = Integer.MIN_VALUE;
    	for (int a : arr) {
    		if( max < a )
    			max = a;
    		
    	}
        return max;
	}

     public static int min(int arr[]) {
    	 int min = Integer.MIN_VALUE;
    	 for (int a : arr) {
    		 if( min > a )
    			 min = a;
    	 }
		return min;
	}
}

 

public class StaticCalculator {
	
	public static void main(String[] args) {
		int arr[] = {70, 80, 85, 50,100};
		
		// 다른 클래스
		//
		System.out.println("abs(-123) = " + Calculator.abs(-123));
		System.out.println("max(arr) = " + Calculator.max(arr));
		System.out.println("min(arr) = " + Calculator.min(arr));
		
		
	}
}
	
