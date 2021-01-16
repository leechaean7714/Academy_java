package Test01;

public class practice01 {
	
	/*
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 
	 * -------------------
	 * 
	 * a B c D e F
	 * g H i J k L
	 * m N o P q R
	 * s T u V w X
	 * y Z
	 */
	
	public static void main(String[] args) {
	
		prn01();
		arr();
	
	}

	private static void prn01() {
		for (int j = 1; j < 6; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.printf("%2d ", i);
			}
			System.out.println();
		}
	}
	
	private static void arr() {
		char a = 'a';
		for (int i = 0; i < 26; i++) {
			if (i % 2 != 0) {
				System.out.print(Character.toUpperCase(a) + " ");
			} else {
				System.out.print(a + " ");
			}
			if(i % 6 == 0) {
				System.out.println();
			}
			a++;
		}

	}
}
