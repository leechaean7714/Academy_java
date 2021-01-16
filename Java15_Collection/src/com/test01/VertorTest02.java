package com.test01;

import java.util.Vector;

public class VertorTest02 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("홍길동");
		v.add("이순신");
		v.add("강호동");
		v.add("유재석");
		v.add("신동엽");
		v.add("조세호");

		// prn(v);
		// System.out.println(v);

		transElement(v);

	}

	public static void transElement(Vector<String> v) {
		// 1. 홍길동의 인덱스를 찾아서, 해당 인덱스에 있는 값을 홍길순으로 바꾸자.
		v.set(v.indexOf("홍길동"), "홍길순");
		prn(v);

		// 2. "신"으로 끝나는 객체를 찾아서, 만일 있다면, 신을 자로 바꾸자.
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).endsWith("신")) {
				v.set(i, v.get(i).replace("신", "자"));
			}

		}
		prn(v);

		// 3. "호"로 끝나는 객체를 찾아서, 만일 있다면 삭제하자.
		/*for (String s : v) {
			if (s.endsWith("호")) {
				v.remove(s);
				break;
			}
		}
		prn(v);

	}
*/
		
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).endsWith("호")) {
				v.remove(i);
			}
		}
		prn(v);
	}
	
	
	public static void prn(Vector<String> v) {
		// 향상된 for문 (forEach)
		for (String s : v) { // v에서 하나하나 빼서 s에 넣는다 왼쪽 : 데이터 하나하나를 대신 받을 변수 오른쪽 : 배열, 콜렉션
			System.out.printf("%s\t", s);
		}
		System.out.println();
	}

}
