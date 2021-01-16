package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MyServer {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("서버입니다.");
		
		// 8888 port number를 통해 서버 생성
		DatagramSocket ds = new DatagramSocket(8888);
		
		//  1024개의 방을 가진 buff라는 받을 방 생성 후 데이터를 받을 준비를 함
		byte[] buff = new byte[1024];
		
		// 받을 방을 packet으로 감싼다.
		DatagramPacket receivePacket = new DatagramPacket(buff, buff.length);
		
		// Data를 받는다.
		ds.receive(receivePacket);
		
		// getData로 받아서 String으로 변환해서 출력
		System.out.println(new String(receivePacket.getData()));
		
		ds.close();
		ds.disconnect();
		
		
	}

}
