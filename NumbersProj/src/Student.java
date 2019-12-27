import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student extends Person {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	private String[] weekdays =
		{"Sunday", "Monday", "Tuesday","Wednesday","Thursday", "Friday"};

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.marks.hashCode();
		result = prime * result + (this.name == null ? 0 : this.name.hashCode());
		result = prime * result + Arrays.hashCode(this.weekdays);
		return result;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String[] weekdays, int... marks) {
		super();
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
		Collections.sort(this.marks);
		this.weekdays = weekdays;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;

		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (!Arrays.equals(this.weekdays, other.weekdays)) {
			return false;
		}
		return true;
	}

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getMax()
	{
		return Collections.max(this.marks);
	}

	public int getMin()
	{

		return Collections.min(this.marks);
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : this.marks) {
			sum = sum + mark;
		}

		return sum;
	}

	public String returnLongString()
	{
		int length = 0;
		String longStr = "None";
		for(String str:this.weekdays)
		{
			if (str.length() > length)
			{
				length = str.length();
				longStr = str;
			}
		}
		return longStr;
	}

	@Override
	public String toString() {
		return String.format("name is %s marks are %s College name is %s passed in year %d", this.name, this.marks,
				super.getCollegeName(), this.getYear());
	}

}
