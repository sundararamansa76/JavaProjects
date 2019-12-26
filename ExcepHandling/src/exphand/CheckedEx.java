package exphand;

public class CheckedEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		someOtherMethod();
	}

	private static void someOtherMethod() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);

		AnotherMethod();
	}

	private static void AnotherMethod() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex1) {
			ex1.printStackTrace();
		}
	}

}
