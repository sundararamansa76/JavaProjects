
public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameConsole gam1 = new GameImpl();
		gam1.up();
		gam1.down();
		int j = GameConsole.i;
		System.out.println("I Is : " + j);
	}

}
