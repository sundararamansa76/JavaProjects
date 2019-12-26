package com.hare.krsna;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int result = 0;
		List<Integer> arrList = new ArrayList<Integer>();
		for (int element : ar) {
			arrList.add(element);
		}
		Collections.sort(arrList);

		int i = 0;
		int length = arrList.size();
		for (; i < length; i++) {
			if (i < length - 1) {
				if (arrList.get(i) == arrList.get(i + 1)) {
					result++;
					i++;
				}
			}
		}
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter("C:\\Users\\sunda\\OneDrive\\Documents\\Sundar\\Java\\Exercises\\sockmerchant.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
