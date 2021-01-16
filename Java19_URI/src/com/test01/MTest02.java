package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class MTest02 {
	
	public static void main(String[] args) throws IOException {
		
		
		URL url = new URL("https://png.pngtree.com/png-clipart/20190402/ourmid/pngtree-cute-dog-soft-furry-dog-elements-png-image_892146.jpg");
			
		byte[] b = new byte[1];
		
		URLConnection urlConnection = url.openConnection();
		urlConnection.connect();
		
		DataInputStream di = new DataInputStream(urlConnection.getInputStream());
		
		FileOutputStream fo = new FileOutputStream("a.png");
		
		while(di.read(b, 0, 1) != -1) {
			fo.write(b, 0, 1);
		}
		
		fo.close();
		di.close();
	}

}
