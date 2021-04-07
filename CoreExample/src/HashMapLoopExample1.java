import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLoopExample1 {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("key1","value1");
		hm.put("key2","value2");
		
		Set<Map.Entry<String,String>> entrySet=hm.entrySet();
		for(Map.Entry entry:entrySet)
		{
			System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
		}
		
		

	}

}
