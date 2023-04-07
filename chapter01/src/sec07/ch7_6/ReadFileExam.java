package sec07.ch7_6;

import java.io.FileReader;
import java.io.Reader;

public class ReadFileExam {

	public static void main(String[] args) throws Exception {

		Reader reader = null;
		
		reader = new FileReader("C:/Users/i7E--047/Downloads/javasample/test.txt");

		while (true) {
			int data = reader.read();
			if (data == -1)
				break;
			System.out.print((char) data);
		}
		
		reader.close();
		System.out.println();
	}

}
