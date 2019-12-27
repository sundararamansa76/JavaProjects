import java.util.Scanner;

public class Solution1 {



	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		scanner.close();
		if (N < 2 || N > 20) {
			System.out.println("Give number in the range of 2 to 20");
		} else {
			for(int i = 1; i<=10;i++)
			{
				System.out.printf("%d * %d = %d", N, i, N * i).println();
			}
		}
	}
}
