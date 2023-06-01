package Day08.Ex03_interface;

public interface RemoteControl {
	
	
	// 상수
	// 인터페이스 변수는 public static final 로 자동으로 선언된다.
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    
    // 추상 메소드
    // : (public abstract) 를 생력하고 작성할 수 있다.
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    
    //
    //
    default void setMute(boolean mute) {
    	if( mute ) {
    		System.out.println("음소기설정");
    		setVolume(0);
    		
    	}
    	else {
    		System.out.println("음소기 해제");
    		setVolume(5);
    		
    	}
    }
    
    // static 메소드(전적 메소드)
    // : 구현 객체가 없어도 인터페이스만
    static void changeBattery( ) {
    	System.out.println(" 배터리를 교환");
    }
    
    
    
    
    
}
