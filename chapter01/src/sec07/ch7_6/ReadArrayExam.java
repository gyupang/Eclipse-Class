package sec07.ch7_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadArrayExam {

	public static void main(String[] args) {

		
		try {
			InputStream ist = new FileInputStream("C:/Users/i7E--047/Downloads/javasample/sample.db");
			byte[] data = new byte[100]; // 100개의 원소를 가진 byte 배열 생성
			while (true) {
				int num = ist.read(data); // 1byte씩 읽기
				if (num == -1) // 파일끝에 도착하면 루프 끝
					break;
				for (int i = 0; i <= num; i++) {
					System.out.println(data[i]);
				}
			}

			ist.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
