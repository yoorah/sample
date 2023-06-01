package Day14;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01_InputStreamReader {
	
	public static void main(String[] args) {
		// 문자 스트림 클래스
		// System.in : 키보드부터 문자를 입력받는 InputStream 객체
		InputStreamReader is = new InputStreamReader(System.in);
		
		while(true) {
			char ch = 0;
			
			try {
				ch = (char) is.read();  // read() : 
			} catch (IOException e) {
				e.printStackTrace();
			}
			// read() 메소드가 더 이상 읽어올 문자가 없으면 -1 반환
			if( ch == -1) {
				break;
			} 
			System.out.println(ch);	
				
			}
		// EOF (End of File)
		// : 원도우 ctrl + Z 단축키를 이용해서.
		//  문자열, 파일의 마지막을 알려주는 키워드
	}
			
	}	
		
	


