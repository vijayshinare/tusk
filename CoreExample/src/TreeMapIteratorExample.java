import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapIteratorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap <String,String> treemap=new TreeMap<String,String>();
		treemap.put("Key1", "Pear");
	    treemap.put("Key2", "Apple");
	    treemap.put("Key3", "Orange");
	    treemap.put("Key4", "Papaya");
	    treemap.put("Key5", "Banana");
	    
	    Set set=treemap.entrySet();
	    Iterator itr=set.iterator();
	    while(itr.hasNext())
	    {
	    	Map.Entry pair=(Map.Entry)itr.next();
	    	System.out.println("Key is: "+pair.getKey()+"and");
	    	System.out.println("value is: "+pair.getValue());
	    }

	}

}
