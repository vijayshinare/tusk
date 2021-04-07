import java.util.Comparator;


public class NameComparator1 implements Comparator<Student2>{

	@Override
	public int compare(Student2 st1, Student2 st2) {
		return st1.name.compareTo(st2.name);
	}

}
