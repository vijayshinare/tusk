import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramString s1=new AnagramString();
		String str1="Race";
		String str2="Care";
		s1.ana(str1,str2);
		
	}

	private void ana(String str1, String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str2.length())
		{
			char [] ch=str1.toCharArray();
			char [] ch1=str2.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			boolean result=Arrays.equals(ch, ch1);
			if(result)
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}
		else
			System.out.println("Not Anagram");
		

		
	}

}
