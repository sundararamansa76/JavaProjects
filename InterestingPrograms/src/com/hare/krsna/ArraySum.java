package com.hare.krsna;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArraySum {

	/*
	 * Complete the simpleArraySum function below.
	 */
	static int simpleArraySum(int[] ar) {

		int sum = 0;
		for (int num : ar) {
			sum += num;
		}
		System.out.println(sum);
		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = Integer.parseInt(scanner.nextLine().trim());

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = 0;
		if (arCount > 0 && arCount <= 1000) {
			result = simpleArraySum(ar);
		}

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}

}
