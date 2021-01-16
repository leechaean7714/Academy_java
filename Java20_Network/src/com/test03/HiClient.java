package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class HiClient implements Runnable {
	
	@Override
	public void run() {
		
	
		try {
			Socket clientSocket; // 서버와 클라이언트가 연결되어 있는 통로
			PrintWriter out = null;
			BufferedReader in = null;
			BufferedReader stdin = null;
			
			
			System.out.println("서버에 접속중 입니다..."); // 서버 생성(ip와 port 주면 클라이언트 생성)
			clientSocket = new Socket("localhost", 9999);
			
			// PrintWriter server에게 보낼 데이터, true(Autoflush) : buffer 초기화
			out = new PrintWriter(clientSocket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));  // sever에서 보내주는 내용을 한 줄씩 받는다
			stdin = new BufferedReader(new InputStreamReader(System.in)); // 콘솔에서 입력해주는 애를 inputStreamReader로 받아서 Buffered를 써서 한 줄씩 받음
			
			String inputLine;
			while((inputLine = stdin.readLine())!=null) {
				out.println(inputLine);
				System.out.println("server로부터 다시 받은 메세지 : " + in.readLine());  // bufferedReader로 가져온 데이터를 한 줄씩 출력
			}
			
			out.close();
			in.close();
			stdin.close();
			clientSocket.close();

   
   	
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		Thread client = new Thread(new HiClient());
		client.start();
	}
}
