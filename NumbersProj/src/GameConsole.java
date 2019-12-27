
public interface GameConsole {
	int i = 5;

	public default void up() {
		System.out.println("This is default method");
	}

	public void down();
}
