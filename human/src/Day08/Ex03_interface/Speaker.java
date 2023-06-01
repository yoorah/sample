package Day08.Ex03_interface;

public class Speaker implements RemoteControl {
	
	// 변수
		private int volume;   // 읍량
			
			
	    public void turnOn() {
			System.out.println("수피커 정원을 켭니다.");
			
		}

	     public void turnOff() {
	    	 System.out.println("스피커 전원을 끕니다.");


		}

	    
		public void setVolume(int volume) {
			// 유효성 검사
			// 불륨 최댓값을 넘지 못하게 지정
			if( volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
				
			}
			// 불륨 최솟값을 넘지 못하게 지정
			else if( volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
				
			}
			else {
				this.volume = volume;
				
			}
		System.out.println("현재 TV 볼륨 : " + this.volume);
		}

	}


	

