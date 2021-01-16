package com.test01;

public class MTest {

	static String str = "     The String class represents character strings.   ";

	public static void main(String[] args) {
		
		String s = "Hello";
		
		//System.out.println(1 + 2+ s);
		//System.out.println(s);
		
		s = s + 1 + 2;
		
		//System.out.println(s);
		//String concatenation
		
		//1. str의 전체 길이 출력하자.
		prn01();
		//2. str 전체 대문자로 바꿔서
		prn02();
		//3. str 전체 소문자로 바꿔서
		prn03();
		//4. str에서 첫 번째로 나오는 c의 인덱스를 
		prn04();
		//5. "class" -> "java"로 바꿔서
		prn05();
		//6. "character" 찾아서 대문자로 변환 후, 변환된 내용으로 전체 출력
		prn06();
		//7. str을 char[]로 출력하되, 'c'만 출력하자. //그리고 c의 갯수도 출력하자
		prn07();
		//8. str을 char[]로 출력하되, 대문자만
		//그리고 대문자의 갯수도
		prn08();
		//9. str 안의 모든 공백 제거 후 출력
		prn09();
		//10. 전체를 역순으로 출력
		prn010();
		
		/*
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf('c'));
		System.out.println(str.replace("class", "java"));
		
		System.out.println(str.charAt(46));
		*/
		}
		
	private static void prn010() {
		/*
		 * .length:배열의 크기
		 * .length():문자열의 크기
		 * .size():컬렉션 프레임 워크 타입의 길이
		 */
		
		int index = 0;
		char[] ch = new char[str.length()];
		for(int i = str.length()-1; i >= 0; i--) {
			ch[i] = str.charAt(index);
			index++;
		}
		System.out.println(ch);
	}

	private static void prn09() {
		
		System.out.println(str.trim()); // 문자열 앞 뒤 공백 제거
		System.out.println(str.replace(" ", ""));
		//정규식:정규식은 문자열에서 특정 패턴을 찾거나 교체, 삭제 등 문자열을 원하는 형태로 편집하는 기능을 제공해 준다.

		System.out.println(str.replaceAll(" ", "")); // regex 정규식을 이용하여 자를 수도 있음
	
	}
	
	
	private static void prn08() {
		
		char[] arr = str.toCharArray();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(arr[i])) {
				System.out.print(arr[i] + " ");
				count++;
			}
		}	
		
		System.out.println("\n 대문자의 갯수 : " + count);
	}
	
	private static void prn07() {

		char[] ch = str.toCharArray();
		int cnt = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'c' || ch[i] == 'C') {
				System.out.println(ch[i]);
				cnt++;
			}
		}
		System.out.println("\nc 의 갯수 : " + cnt);
	}
		
	//6. "character" 찾아서 대문자로 변환 후, 변환된 내용으로 전체 출력	
	private static void prn06() {
		
     String target = "character";
     int start = str.indexOf(target);
     int end = start + target.length();
     
     String upper = str.substring(start, end).toUpperCase();
     
     System.out.println(str.replace(target,  upper));
			
		}


	private static void prn05() {
		
		System.out.println(str.replace("class", "java"));
		
	}

	private static void prn04() {
		System.out.println(str.indexOf('c'));
		
	}

	private static void prn03() {
		System.out.println(str.toLowerCase());
		
	}

	private static void prn02() {
		
		System.out.println(str.toUpperCase());
		
		
	}

	private static void prn01() {
		
		System.out.println(str.length());
	}

}
