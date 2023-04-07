package sec07.ch7_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExam {

	public static void main(String[] args) {


		String img1 = "C:/Users/i7E--047/Downloads/javasample/test.png";
		String img2 = "C:/Users/i7E--047/Downloads/javasample/alba.png";

		// 입출력 스트림 생성
		InputStream orImg = new FileInputStream(img1);
		OutputStream newImg = new FileOutputStream(img2);

//읽은 데이터를 저장할 배열 설정
//		byte[] data = new byte[1024];
//
//		while (true) {
//			int num = orImg.read(data); // 최대 1024 바이트를 읽어 배열에 저장, 읽은 바이트는 리턴
//			if (num == -1) // 다읽으면 break
//				break;
//			newImg.write(data, 0, num); // 읽은 바이트 수만큼 출력
//		}

		orImg.transferTo(newImg);
//
		newImg.flush();
		orImg.close();
		newImg.close();
	}

}
