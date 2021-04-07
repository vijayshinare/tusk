import java.util.ArrayList;
import java.util.Iterator;


public class ArraylistEx {

	public static void main(String[] args) {
		ArrayList<String>ar=new ArrayList<String>();
		ar.add("Arjun");
		ar.add("0");
		ar.add("Arjun3");
		ar.add("Arjun2");
		Iterator itr= ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/* for(String a:ar)
		{
			System.out.println(a);
		}*/

	}

}
