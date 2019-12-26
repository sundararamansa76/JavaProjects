package exphand;

import java.util.Scanner;

public class TryWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scan1 = new Scanner(System.in)) {
			int nextInt = scan1.nextInt();
			System.out.println("I am never called if you make mistake " + nextInt);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Scanner closed automatically");
		}
	}

}
