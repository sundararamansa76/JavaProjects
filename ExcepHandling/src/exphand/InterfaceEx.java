package exphand;

interface InterfaceEx {
	int value1 = 10;
	public int value2 = 100;
	public static int value3 = 1000;
	public static final int value4 = 10000;

	public void printHK();

	default void method6() {
		System.out.println("Hari Hari Bol!!!");
	}
}