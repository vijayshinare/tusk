import java.util.ArrayList;
import java.util.Collections;


public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Student> al=new ArrayList<Student>();
		al.add(new Student(101,"vijay",23));
		al.add(new Student(110,"raj",25));
		al.add(new Student(109,"kiran",21));
		al.add(new Student(107,"shyam",22));
		
		
	/*	Collections.sort(al);
		 for(Student st:al)
	        {
	        	System.out.println(st.rollno+""+st.name+""+st.age);
	        }*/
		
		System.out.println("Sorting by name");
        Collections.sort(al,new NameComparator());
        for(Student st:al)
        {
        	System.out.println(st.rollno+"---- "+st.name+" -----"+st.age);
        }
        
        System.out.println("Sorting by Age");
        Collections.sort(al,new AgeComparator());
        for(Student st:al)
        {
        	System.out.println(st.rollno+"---- "+st.name+" -----"+st.age);
        } 
	}

}
