package sec11.ch03;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExam {

	public static void main(String[] args) {
		try {
			// 소켓 생성과 동시에 localhost:8081로 연결 요청
			Socket socket = new Socket("localhost", 8081);
			System.out.println("클라이언트가 8081로 요청에 성공했습니다.");
			System.out.println("Nomcat에 연결되었습니다.");

			// 소켓 닫기
			socket.close();
			System.out.println("클라이언트가 연결을 끊었습니다.");
		} catch (UnknownHostException e) {
			// TODO: handle exception
		} catch (IOException e) {

		}

	}

}
