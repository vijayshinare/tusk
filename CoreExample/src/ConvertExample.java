import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertExample {

	public static void main(String[] args) {
		LinkedList<String> linkedlist=new LinkedList<String>();
		 linkedlist.add("Mango");
		    linkedlist.add("Banana"); 
		    linkedlist.add("Pear");
		    linkedlist.add("Apple");
		    linkedlist.add("Orange");
		    List<String> list=new ArrayList<>(linkedlist);
           
		    for(String str:list)
		    {
		    	System.out.println(str);
		    }
	}

}
