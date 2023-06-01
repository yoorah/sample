package Day07.Ex05_StaticMember;

/*
 * 싱글톤 패턴
 * -디자인 패턴 중의 하나로,
 * 프로그램이 시작될 때, 최초로 한 번만 메모리를 할당해서 인스턴스를 사용하는 패턴
 * - 객체가 필요할 때, 새로운 객체를 생성하지 않고 기존의 인스턴스를 활용한 코드의 패턴
 * -
 */
public class SingleTon {
	
	private static SingleTon instance = new SingleTon();
	
	// 생성자를 private 으로 정의
	private SingleTon() {
		
	}

	// 인스턴스 (객체)가 생성되지 않았다명, 생성해주고
	// 이미 생성되어 있다면
	public static SingleTon getInstance() {
		
		if( instance == null) {
			instance = new SingleTon();
			
		}
		return instance;
	}
	
}
