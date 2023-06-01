package Day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05_TextFileCopy {
	
	public static void main(String[] args) {
		// 파일 복사
		// test.txt 파일을 test4.txt 파일로 복사
		FileReader fr = null;
		FileWriter fw = null;
		
		int data = 0;
		
		try {
			fr = new FileReader("test.txt");
			fw = new FileWriter("test4.txt");
			
			while( (data = fr.read() ) != -1) {
				fw.write(data);
			}
			System.out.println("test.txt -> test4.txt 파링을 복사하였습니다.");
			fr.close();
			fw.close();
		
		}catch (FileNotFoundException e) {
			System.out.println("파링이 존재하지 않습니다.");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("입출력 시, 예외가 발행하였습니다.");
			e.printStackTrace();
		}
	
		
	}

}
