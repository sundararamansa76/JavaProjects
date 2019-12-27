import java.util.Scanner;

public class ReceipeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractReceipe rec1 = new ReceipeImpl();
		rec1.getReady();
		rec1.execute();

		AbstractReceipe rec2 = new ReceipeImpl2();
		rec2.getReady();
		rec2.execute();

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		String str0 = scan.nextLine();
		String str1 = scan.nextLine();
		scan.close();

		System.out.println("String is  " + +i + "  " + str1);
	}

}
