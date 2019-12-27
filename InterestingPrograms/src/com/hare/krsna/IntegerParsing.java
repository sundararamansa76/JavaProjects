package com.hare.krsna;
import java.util.Scanner;

public class IntegerParsing {
	public static void main(String[] args) {

		DoNotTerminate.forbidExit();

		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			// String s=???; Complete this line below

			// Write your code here
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			scanner.close();
			String s = "";

			if (num <= 100 && num >= -100) {
				s = s + num;
			}

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

//The following class will prevent you from terminating the code using exit(0)!
