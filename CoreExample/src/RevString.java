
public class RevString {

	
	public static void main(String[] args) {
	String str1="Hello World";
	String revString="";
	System.out.println(revString);
	
	for(int i=str1.length()-1; i>=0;i--)
	{
		revString=revString+str1.charAt(i);
	}
	System.out.println(revString);

	}

}
