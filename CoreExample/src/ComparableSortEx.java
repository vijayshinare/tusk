import java.util.ArrayList;
import java.util.Collections;


public class ComparableSortEx {

	public static void main(String[] args) {
		ArrayList<Student1>al=new ArrayList();
		al.add(new Student1(101,"Sonali",29));
		al.add(new Student1(100,"Monali",21));
		al.add(new Student1(108,"Akruti",28));
		
		Collections.sort(al);
		
		for(Student1 st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
