package com.hare.krsna;
import java.math.BigInteger;
import java.util.Scanner;

public class IsPrimeBigInt {



	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String n = scanner.nextLine();
		scanner.close();
		if (n.length() <= 100) {
			BigInteger bint = new BigInteger(n);

			if (bint.isProbablePrime(1)) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}
			;
		}
		/*
		 * if (n.length() <= 100) { BigDecimal bdec = BigDecimal.valueOf(num);
		 *
		 * if (num >= 1 && num <= 100) { boolean isPrime = true; if (num <= 1) { isPrime
		 * = false; } for (int i = 2; i < num; i++) { if(i!= num) { if(num %i ==0) {
		 * isPrime = false; } } } if (isPrime) { System.out.println("prime"); } else {
		 * System.out.println("not prime"); } } }
		 */
	}
}
