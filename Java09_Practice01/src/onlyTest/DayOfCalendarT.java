package onlyTest;

import java.util.Scanner;

public class DayOfCalendarT {

	public static boolean isLeapYear(int year) {

		boolean leap = false;
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			leap = true;

		}
		return leap;
	}

	public static int dates(int year, int month) {

		int res = 0;
		if (isLeapYear(year)) {

			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				res = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				res = 30;
				break;
			case 2:
				res = 29;

				break;
			}

		} else {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				res = 31;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				res = 30;
			} else if (month == 2) {
				res = 28;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int sum = 0;

		System.out.println("year input!!.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("month input!!");
		int month = sc.nextInt();
		System.out.println("day input!!");
		int day = sc.nextInt();

		for (int i = 1; i < year; i++) {
			for (int j = 1; j <= 12; j++) {
				sum += dates(i, j);
			}

		}
		for (int i = 1; i < month; i++) {
			sum += dates(year, i);

		}
		sum += day;
		System.out.printf("%d년 %d월 %d일    %s입니다 ", year, month, day, dayMode(sum % 7));

	}

	public static String dayMode(int day) {

		switch (day) {
		case 0:
			return "sunday";
		case 1:
			return "monday";
		case 2:
			return "tuesday";
		case 3:
			return "wednesday";
		case 4:
			return "thurseday";
		case 5:
			return "friday";

		case 6:
			return "saturday";

		}
		return null;

	}

}
