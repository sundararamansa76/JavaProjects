package snippets;

import java.util.List;

public class FnalProgramRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Krsna", "balaram", "Rama", "Hare");
		printListFilterFP(list);
	}

	private static void printList(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}

	private static void printListFilter(List<String> list) {
		for (String str : list) {
			if (str.endsWith("a")) {
				System.out.println(str);
			}
		}
	}

	private static void printListFilterFP(List<String> list) {
		list.stream().filter(element -> element.endsWith("a")).forEach(
				element -> System.out.println(element)
				);
	}

	private static void printListFP(List<String> list) {
		list.stream().forEach(
				element -> System.out.println("Superme Person - " + element)
				);
	}
}
