import java.util.HashMap;
import java.util.Map;


public class HashmapEx {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1,"vijay");
		hm.put(2,"ajay");
		hm.put(3,"ashok");
		hm.put(4,"rahul");
		hm.put(4,"nitin");
		hm.put(3,"kiran");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		}

	}


