import java.util.ArrayList;
import java.util.Collections;


public class ComparatorSort {

	public static void main(String[] args) {
		ArrayList<Student2> al=new ArrayList<Student2>();
		al.add(new Student2(101,"Raj",34));
		al.add(new Student2(1103,"Ajay",45));
		al.add(new Student2(99,"Mahesh",23));
		System.out.println("Sorting by Name");
		Collections.sort(al, new NameComparator1());
		for(Student2 st: al)
			System.out.println(st.rollno+"-- "+st.name+"-- "+st.age);
		
		System.out.println("Sorting by age");
		Collections.sort(al, new AgeComparator1());
		for(Student2 st: al)
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		
		
	}

}
