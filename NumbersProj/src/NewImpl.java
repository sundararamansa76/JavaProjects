
interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Birds fly");

	}

}

class Hen implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Hen fly");
	}

}

class NewImpl {
	public static void main(String[] args) {
		Flyable[] livingEntities = { new Bird(), new Hen() };
		for (Flyable object : livingEntities) {
			object.fly();
		}
	}
}
