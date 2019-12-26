package exphand;

public class ExpHandlingRunner2 extends Object {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();

		System.out.println("Hare Krsna");

	}

	private static void method1() {
		method2();
		System.out.println("Hare Rama");
	}


	private static void method2() {
		try {
			// int[] i = { 1, 2 };
			// int num = i[3];
			ExpHandleH ex1 = new ExpHandleH();
			String str = "Hari bol!!!";
			ex1.setStr(str);
			String str2 = ex1.clone();

			System.out.println("Clone! " + str2);
		} catch (NullPointerException ex) {
			System.out.println("This is null pointer");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index out of bound");
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
		}
		System.out.println("Hari bol!");
	}

}
