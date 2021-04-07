import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		duplicateCharCount("JavaJ2EE");

	}

	 static void duplicateCharCount(String inputString) {
	  HashMap<Character,Integer> charcountMap=new HashMap<Character,Integer>();
	  
	  char [] ch=inputString.toCharArray();
	  
	  for(char c:ch)
	  {
		  if(charcountMap.containsKey(c))
		  {
			  charcountMap.put(c,charcountMap.get(c)+1);
		  }
		  else
			  charcountMap.put(c,1);
	  }
		//System.out.println(inputStr+":"+charcountMap);
		
	  Set<Character> charsInString = charcountMap.keySet();
	  
      System.out.println("Duplicate Characters In "+inputString);
      
      for(Character ch1:charsInString)
      {
    	  if(charcountMap.get(ch1) > 1)
          {
              //If any char has a count of more than 1, printing it's count

              System.out.println(ch1 +" : "+ charcountMap.get(ch1));
          }
      }

	}

}
