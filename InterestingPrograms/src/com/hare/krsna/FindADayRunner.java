package com.hare.krsna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts following parameters:
	 *  1. INTEGER month
	 *  2. INTEGER day
	 *  3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		LocalDate localdate = LocalDate.of(year, month, day);
		DayOfWeek dow = DayOfWeek.from(localdate);
		String s = "";
		if (year > 2000 && year < 3000) {
			s = s + dow;
		}
		System.out.println(s);
		return s;
		//		String dayString = "";
		//		if (year > 2000 && year < 3000) {
		//			Calendar c = Calendar.getInstance();
		//			c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		//			c.set(year, month, day);
		//			int days = c.getTime().getDay();
		//			switch (days) {
		//			case 1:
		//				dayString = "FRIDAY";
		//				break;
		//			case 2:
		//				dayString = "SATURDAY";
		//				break;
		//			case 3:
		//				dayString = "SUNDAY";
		//				break;
		//			case 4:
		//				dayString = "MONDAY";
		//				break;
		//			case 5:
		//				dayString = "TUESDAY";
		//				break;
		//			case 6:
		//				dayString = "WEDNESDAY";
		//				break;
		//			case 7:
		//				dayString = "THURSDAY";
		//				break;
		//			}
		//			System.out.println(dayString);
		//		}
		//		return dayString;
	}

}

public class FindADayRunner {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\temp\\sample.txt"));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);

		bufferedWriter.write(res);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
