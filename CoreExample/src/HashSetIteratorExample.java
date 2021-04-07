import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteratorExample {

	public static void main(String[] args) {
	HashSet<String> hs=new HashSet<String>();
	hs.add("Hello");
	hs.add("Hi");
	hs.add("Hey");
	hs.add("Go");
	hs.add("Wo");
	hs.add("Bye");
	
	/* Iterator<String> itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}*/
	
	for(String s:hs)
	{
		System.out.println(s);
	}
	
	

	}

}
