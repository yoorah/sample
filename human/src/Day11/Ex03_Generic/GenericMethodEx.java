package Day11.Ex03_Generic;

class GenericMethod {
	
	//
	//
	public <T> T method1(T t) {
		return t;
		
	}

    //
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}

	//
	public <K, V>void mrthod3(K k, V v) {
		System.out.println(k + " : " + v);
	}
	
}
public class GenericMethodEx {
	
	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		
		//
		//
		String srt1 = gm.<String>method1("제네릭 메소드");
		String str1;
		System.out.println("str1 : " + str1);
		
		//
		//
		boolean bool1 = gm.<Double>method2(10.5, 10.5);
		System.out.println("bool1 : " + bool1);
		
		boolean bool2 = gm.<Double>method2(10.5, 20.5);
		System.out.println("bool2 : " + bool2);
		
		gm.<String, Integer>method2("자바 점수 : ", 90);
		gm.method2("HTML 점수", 100 );
		
		
	}
	
	
	

		
	}


