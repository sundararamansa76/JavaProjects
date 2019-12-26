package generic;

import java.util.ArrayList;

public class MyCustomList<T extends Number> {
	ArrayList<T> list = new ArrayList<T>();

	public void addElement(T element) {
		this.list.add(element);
	}

	public void removeElement(T element) {
		this.list.remove(element);
	}

	@Override
	public String toString() {
		return String.format("MyCustomList [list=%s]", this.list);
	}

	public T get(int i) {
		// TODO Auto-generated method stub
		return this.list.get(i);

	}

}
