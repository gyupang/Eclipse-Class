package sec07.ch7_6;

import java.io.FileWriter;
import java.io.Writer;

public class WriterFileExam {

	public static void main(String[] args) throws Exception {
		
		// 문자기반 출력 스트림
		Writer writer = new FileWriter("C:/Users/i7E--047/Downloads/javasample/test.txt");
		
		char a = 'A';
		writer.write(a);

		char b = 'B';
		writer.write(b);

		// 배열출력
		char[] arr = { 'C', 'D', 'E' };
		writer.write(arr);

		// String 출력
		writer.write("JAMES");
		writer.flush();
		writer.close();

		System.out.println("파일생성 완료");
	}

}
