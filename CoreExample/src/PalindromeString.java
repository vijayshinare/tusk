
public class PalindromeString
{
	public static void main(String[] args) {
		String s="jalaj",rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev +s.charAt(i);
		}
			
			if(s.equals(rev))
				System.out.println("Palindrome");
			else
				System.out.println("not");
		

	}
}
