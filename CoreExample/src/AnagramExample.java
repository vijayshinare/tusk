import java.util.HashSet;
import java.util.SortedSet;

public class AnagramExample {

	public static void main(String[] args) {
     String [] rawlist= {"abc","cba","BCa"};
     
     HashSet<String> uniquestr=new HashSet<String>();
     
     for(String s:rawlist)
     uniquestr.add(sortString(s.toLowerCase()));
System.out.println(uniquestr);
	}
	

	private static String sortString(String s) {
		char c[]=s.toCharArray();
		java.util.Arrays.sort(c);
		return new String(c);
	}

}
