package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MyClient {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("클라이언트입니다.");
		
		// 클라이언트 생성
		DatagramSocket ds = new DatagramSocket();
		
		// 보낼 데이터를 바이트로 바꿔서 바이트배열에 저장
		byte[] buff = "연습입니다".getBytes();
		
		// Packet으로 전송할 데이터를 감싼다.
		DatagramPacket sendPacket = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"), 8888);
		
		// Data 보낸다.
		ds.send(sendPacket);
		
		ds.close();
		ds.disconnect();
	}

}
