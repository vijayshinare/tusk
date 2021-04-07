import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDescendingSort {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		 arr.add("Apple");
		 arr.add("Banana");
		 arr.add("Pear");
		 arr.add("Mango");
		 
		 System.out.println("ArrayList Before Sorting");
		 for(String str:arr)
		 {
			 System.out.println(str);
		 }
		 
		 Collections.sort(arr, Collections.reverseOrder());
		 
		 System.out.println("ArrayList in decending order");
		 for(String str:arr)
		 {
			 System.out.println(str);
		 }

	}

}
