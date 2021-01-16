package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {
	
	public static void main(String[] args) throws URISyntaxException {
		
		URI u = new URI("http://localhost:8787/java19_URI_Web/res.jsp?myname=%EC%98%81%ED%83%9C&myaddr=%EB%8F%88%EB%B0%AD");
		
		System.out.println(u.getScheme());
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		System.out.println(u.getPath());
		System.out.println(u.getQuery());
		
		
	}

}
