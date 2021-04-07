import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArraytoArrayList {

	public static void main(String[] args) {
		Integer[] a ={10,20,30,50};
		 // List l=Arrays.asList(a);
		List<Integer> l=new ArrayList<Integer>(Arrays.asList(a));
		 // l.add(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);

	}

}
