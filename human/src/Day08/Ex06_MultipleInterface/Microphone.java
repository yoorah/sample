package Day08.Ex06_MultipleInterface;

public interface Microphone {
	
	int inputVolumeMax = 50;  // 음성 인식 최대 볼륨
	int inputVolumeMin = 5;   // 음성 인식 최소 볼륨
	
	// 음성 인식
	String receiveVoice(String voice);
	

}
