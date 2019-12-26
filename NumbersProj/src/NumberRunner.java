import com.hare.krsna.NumberCheck;

public class NumberRunner {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NumberCheck numCheck = new NumberCheck();
		//		System.out.println("The number " + number + " is Prime ?? " + numCheck.isPrime(number));
		//		numCheck.printTriangle(number);
		// numCheck.printSquares(number);
		// numCheck.printCubes(number);
		/*
		 * int cube = 0; int number = 0; Scanner scan = new Scanner(System.in); do {
		 * System.out.println("Enter a nUmber"); number = scan.nextInt();
		 * System.out.println("Cube is : " + number * number * number); } while (number
		 * >= 0);
		 */
		int i = 1;
		NumberCheck num1 = new NumberCheck(25);
		do {
			NumberCheck num2 = num1;
			num2.setAssignNum(100);
		} while (i < 1);
		System.out.println("The assigned no is: " + num1.getAssignNum());
	}

}
