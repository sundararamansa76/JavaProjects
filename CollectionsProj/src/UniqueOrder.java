import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueOrder {

	public static void main(String[] args) {
		List<Character> chars = List.of('A', 'Z', 'A', 'B', 'Z', 'F', 'C', 'd', 'i');

		Set<Character> treeSet1 = new TreeSet<Character>(chars);
		System.out.println("Tree Set" + treeSet1);
		Set<Character> linkedSet1 = new LinkedHashSet<Character>(chars);
		System.out.println("Linked Hash Set " + linkedSet1);
		Set<Character> hashSet1 = new HashSet<Character>(chars);
		System.out.println("Hash Set: " + hashSet1);
	}
}
