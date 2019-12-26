import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLenComparator implements Comparator<String> {

	@Override
	public int compare(String val1, String val2) {
		// TODO Auto-generated method stub
		return Integer.compare(val1.length(), val2.length());
	}

}

public class CustomOrderRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue1 = new PriorityQueue<String>(new StringLenComparator());
		queue1.addAll(List.of("Balaram", "Radhe", "Krsna", "Hare"));
		System.out.println(queue1);



	}


}
