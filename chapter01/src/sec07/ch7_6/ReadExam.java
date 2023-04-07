package sec07.ch7_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam {

	public static void main(String[] args) {

		
		try {
			InputStream ist = new FileInputStream("C:/Users/i7E--047/Downloads/javasample/sample.db");
			while (true) {
				int data = ist.read(); // 1byte씩 읽기
				if (data == -1) // 파일끝에 도착하면 루프 끝
					break;
				System.out.println(data);
			}
			
			ist.close(); // 꼭 끝내주기
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
