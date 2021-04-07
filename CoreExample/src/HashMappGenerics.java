import java.util.HashMap;
import java.util.Map;


public class HashMappGenerics {

	public static void main(String[] args)
	{
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(1, "Karan");
	map.put(5, "amol");
	map.put(4, "sravan");
	map.put(2, "Raj");
	map.put(null, "Raj1");
	map.put(null, "Raj2");
	
	for(Map.Entry m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}

	}

}
