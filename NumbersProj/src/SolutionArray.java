import java.util.ArrayList;
import java.util.Scanner;

class SolutionArray {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		ArrayList<Integer> arrA = new ArrayList<Integer>();
		ArrayList<Integer> arrB = new ArrayList<Integer>();
		ArrayList<Integer> arrN = new ArrayList<Integer>();
		if (t < 0 || t > 500) {
			System.out.println("Give the correct range 0 to 500");
		} else {
			for (int i = 0; i < t; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				int n = in.nextInt();
				if (a < 0 || a > 50 || b < 0 || b > 50 || n < 1 || n > 15) {
					System.out.println("a and b should be within 0 to 50 and n should be within 1 to 15");
				} else {
					arrA.add(a);
					arrB.add(b);
					arrN.add(n);
				}
			}
			int i = 0;
			int result = 0;
			int bVal = 0;
			int temp = 0;
			for (int aVal : arrA) {
				//System.out.println(aVal + " " + arrB.get(i) + " " + arrN.get(i));
				bVal = arrB.get(i);
				for (int j = 1; j <= arrN.get(i); j++)
				{
					result = aVal;
					for (int k = 0; k < j; k++) {
						temp = (int) Math.pow(2, k);
						result = result + bVal * temp;
					}
					System.out.print(result + " ");
				}
				System.out.println("");
				i++;
			}

		}
		in.close();



	}
}
