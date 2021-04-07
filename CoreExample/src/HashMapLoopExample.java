import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapLoopExample {

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<>();
		hm.put("key1", "Value1");
		hm.put("key2", "Value2");
		hm.put("key3", "Value3");
		
	/*	for(String str:hm.keySet())
		{
			System.out.println("key:"+ str + " value "+hm.get(str));
		}
		*/
		
		Set<String> keySet=hm.keySet();
		Iterator<String> keySetIterator=keySet.iterator();
		while(keySetIterator.hasNext())
		{
			String key=keySetIterator.next();
			System.out.println("key:="+key +"value="+hm.get(key));
		}

	}

}
