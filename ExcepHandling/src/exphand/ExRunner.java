package exphand;

public class ExRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExRunner2 ex2 = new ExRunner2();
		ex2.printHK();
		ex2.method6();
	}

}

class ExRunner2 implements InterfaceEx {
	@Override
	public void printHK() {
		System.out.println(InterfaceEx.value1);
		System.out.println(InterfaceEx.value2);
		System.out.println(InterfaceEx.value3);
		System.out.println(InterfaceEx.value4);
		System.out.println("Hare KRsna");
	}
}