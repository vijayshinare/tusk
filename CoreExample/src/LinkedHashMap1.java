import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMap1 {

	public static void main(String[] args) {
	LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
	hm.put(1,"Amit");
	hm.put(3,"Karan");
	hm.put(2,"Sharad");
	
	System.out.println(hm.toString());
	
	/*for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+""+m.getValue());
	}*/

	}

}
