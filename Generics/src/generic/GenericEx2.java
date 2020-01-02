package generic;

import java.util.ArrayList;

public class GenericEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> items = new ArrayList<Integer>();
		items.add(1);
		items.add(2);
		items.add(3);
		//items.add("Hare");
		items.add(4);
		items.add(5);
		
		printDoubled(items);
	}

	private static void printDoubled(ArrayList<Integer> items) {
		for(Integer i :items)
		{
			System.out.println( i * 2);
		}
	}

}
