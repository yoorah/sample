package Day08.Ex02_Phone;

public abstract class Phone {

	// 변수
	public String owner;      // phone 사용자명
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
		
	}

    // 메소드 
	public void turnON() {
		System.out.println("정원 켭니다...");
		
	}

	public void turnOff() {
		System.out.println("전원 끕니다...");
	}
	
}


