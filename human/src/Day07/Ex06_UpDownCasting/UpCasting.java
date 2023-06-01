package Day07.Ex06_UpDownCasting;

public class UpCasting {
	
	public static void main(String[] args) {
		// 업캐스팅 (자동 타입 변환)
		// (부모 크래스) = (자식 클래스)
		Person person = new Student("김휴먼", 20, 1, "문예창작과");
		
		// Person  : name, age
		// Student : name, age, grade, major
		System.out.println(" name : " + person.name);
		System.out.println(" age : " + person.age);
		
		// Person 객체에서는 grade, major 변수를 접근할 수 없다.
		// System.out.println(" grade : " + person.grade);
		// System.out.println(" major : " + person.major);
		
		// 클래스를 업캐스팅 하명,
		// 변수는 부모 클래스의 있는 변수만 접근 가능하고,
		// 메소드는 자식 클래스의 메소드가 우선하여 실행된다.
		
		// 바인딩(Binding)
		// : 프로그램에서 사용되는 요소에 실제 결정짓는 행위
		// - 정적 바이딘
		// : 컴파일 시간에 결정
		//  변수 등
		
		// - 동적 바이딩
		// : 실행 시간에 결정
		//  오버라이딩 등
		
		System.out.println( person );
		
		System.out.println( person.work());
				
	}

}
