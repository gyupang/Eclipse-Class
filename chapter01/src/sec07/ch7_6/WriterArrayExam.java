package sec07.ch7_6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterArrayExam {

	public static void main(String[] args) {

		try {
			OutputStream os = new FileOutputStream("C:/Users/i7E--047/Downloads/javasample/sample2.db");

			byte[] array = { 10, 20, 30, 40, 50, 60 };
			
			os.write(array, 2, 4);
			
			os.flush();
			os.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
