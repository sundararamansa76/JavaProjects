package com.hare.krsna;

import java.util.Scanner;

public class PalindromeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = A.trim();
		// System.out.println(A);
		char[] ch1 = A.toCharArray();
		// char[] ch2 = A.toCharArray();
		boolean isPalidrom = true;
		int i = 0;
		for (int j = A.length() - 1; j > 0; j--) {
			if (ch1[i] != ch1[j]) {
				isPalidrom = false;
			}
			i++;
		}
		if (isPalidrom) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
