package Day08.Ex03_interface;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		//이ㄴ터페이스타입 객체명 =new 구현클래스();
		RemoteControl tvRc = new Television();
		tvRc.turnOn(); 
		tvRc.setVolume(5); 
		tvRc.setVolume(100); 
		tvRc.setMute(true);     //음소기 
		tvRc.turnOff(); 
		System.out.println();
		
		RemoteControl speakerRc= new Speaker();
		speakerRc.turnOn(); 
		speakerRc.setVolume(5); 
		speakerRc.setVolume(100); 
		speakerRc.setMute(false);     //음소기 해제
		speakerRc.turnOff(); 
		System.out.println();
		
		RemoteControl.changeBattery();  // 리모콘 배터리 교체
	}

}
