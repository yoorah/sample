package Day08.Ex06_MultipleInterface;

// 인터페이스 다중 상속
// public interface 인터페스명 extends 인터페이스A,  인터페이스B ...{}

public interface SmartRemoteControl extends RemoteControl, Microphone {
	
    // 터치패드 기능
	// x, y 촤표 위치에 터치패드를 클릭
	void touch(int x, int y);


}
