
public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person st2 = new Student("Raman", 100, 2, 2, 3, 3);
		Student st1 = new Student("Sundar", 100, 2, 3, -1, 5);
		st1.setCollegeName("REC Trichy");
		st1.setYear(1998);
		st2.setCollegeName("RVS");
		st2.setYear(1997);
		System.out.println(st1.getSumOfMarks());
		System.out.println(st1.returnLongString());
		System.out.println("Min is " + st1.getMin());
		System.out.println("Max is " + st1.getMax());
		System.out.println(st1);
		System.out.println(st2);

	}

}
