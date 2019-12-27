package exphand;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		try {
			int[] num = { 1, 2, 3, 4, 5, 6, 7, 989 };
			int num1 = num[10];

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception handled");
			ex.printStackTrace();

		} finally {
			System.out.println("Scanner closed");
			if(scan != null) {
				scan.close();
			}
		}

		System.out.println("Executed");
	}

}
