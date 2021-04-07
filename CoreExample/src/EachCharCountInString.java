import java.util.HashMap;

public class EachCharCountInString {

	public static void main(String[] args) {
		charactercount("Java J2EE Java JSP J2EE");
		charactercount("All Is Well");
		  
	   charactercount("Done And Gone");

	}

	public static void charactercount(String inputString) {
		HashMap<Character, Integer> charCountMap=new HashMap<Character, Integer>();
		
		char ch[]=inputString.toCharArray();
		
		for(char c:ch)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{
				charCountMap.put(c, 1);
			}
			
		}
		System.out.println(inputString +":"+charCountMap);
		
	}

}
