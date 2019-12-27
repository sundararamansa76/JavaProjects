import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescStudComparator implements Comparator<Student> {

	@Override
	public int compare(Student stud1, Student stud2) {
		// TODO Auto-generated method stub
		return Integer.compare(stud2.getId(), stud1.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studs = List.of(new Student(2, "Krsna"), new Student(1, "Hare"), new Student(3, "Rama"));
		System.out.println(studs);
		/*
		 * double num12 = 100; long num123 = (long) num12;
		 */

		StringBuilder str1 = new StringBuilder();
		str1.append("Hare");
		str1.append("Krsna");
		str1.append("Rama");
		System.out.println(str1);


		List<Student> studsAl = new ArrayList<Student>(studs);
		Collections.sort(studsAl);

		System.out.println("Ascending " + studsAl);
		// Collections.sort(studsAl, new DescStudComparator());

		studsAl.sort(new DescStudComparator());
		System.out.println("Descending " + studsAl);
	}

}
