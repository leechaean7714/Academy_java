package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HiServer {

	public static void main(String[] args) {
		// 사용할 변수 선언
		ServerSocket serverSocket = null; 
		Socket serviceSocket; 
		PrintWriter out = null;
		BufferedReader in = null;

		try {
			serverSocket = new ServerSocket(9999);
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			System.out.println("client를 기다립니다...");

			try {
				// 서버 소켓에 접속된 애를 소켓으로 관리
				serviceSocket = serverSocket.accept();  // 클라이언트와 연결되어 있는 소켓

				System.out.println("client가 접속했습니다.");
				// InputStreamReader : 흘러들어오는 바이트를 문자로
				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));

				out = new PrintWriter(serviceSocket.getOutputStream(), true);

				String inputLine;
				// 콘솔창에서 한 줄 읽어와서 읽어온 데이터가 null 값이 아니면 출력
				while ((inputLine = in.readLine()) != null) {
					// in : 콘솔창에서 받아온 값
					System.out.println("client가 보낸 메세지 : " + inputLine);
					out.println("★" + inputLine); // out : PrintWriter
				}

				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
