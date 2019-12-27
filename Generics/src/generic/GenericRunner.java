package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {

	static <X> X doSomething(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {

		list.addAll(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums = new ArrayList<Integer>(List.of(1, 2, 3));
		duplicate(nums);
		System.out.println("NUmbers are :: " + nums);
		doSomething(new String());
		doSomething(Integer.valueOf(5));
		MyCustomList<Long> list = new MyCustomList<Long>();
		list.addElement((long) 1020283828);
		list.addElement((long) 1922492924);


		Long value = list.get(0);

		MyCustomList<Integer> list2 = new MyCustomList<Integer>();
		list2.addElement(100);
		list2.addElement(200);

		Integer num = list2.get(0);
		System.out.println("LIST1 " + list.toString());
		;

		System.out.println("LIST2 " + list2.toString());
		;

		System.out.println(" " + value + " " + num);
	}

}
