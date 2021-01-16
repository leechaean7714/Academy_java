package onlyTest;

import java.util.Scanner;

public class onlyTest {

	public static void main(String[] args) {
		
		
		int num = 0; // 입력된 숫자가 저장될 변수를 초기화 한다.
		int sum = 0; // 입력된 숫자의 각 자리의 합을 저장할 변수를 초기화 한다.

		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		while (num != 0) {
			System.out.println("num01:"+num);
			
			sum += num % 10;
		    //	     8  + 7   % 10
			//sum = sum + num % 10
			
			System.out.println("sum:"+sum);
			num /= 10;
			//num=num/10
			System.out.println("num02:"+num);
		}
		System.out.println("각 자리수의 합은 " + sum + "입니다.");
		System.out.println("프로그램을 종료합니다.");
		sc.close();

		//System.out.println(plusFor(input));
	}

	public static int plusFor() {

		/*
		 * int sum = 0; for(int target =i;target>0;target/=10) { sum+=target%10; }
		 * return 0;
		 */
		

		return 0;
	}

}