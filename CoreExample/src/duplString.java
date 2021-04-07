
public class duplString {

	
	public static void main(String[] args) 
	{	
	String str="Hello world";
	String ans="";
	str=str +" ";
	int count=1;

	char s1,s2,l;
	
	for(int i=0;i<str.length()-1;i++)
	{
		l=str.charAt(i);
	if(l==' ')
	{
		count++;
		System.out.println("word count"+count);
		
	}
	}
	
	for(int i=0;i<str.length()-1;i++)
	{
		s1=str.charAt(i);
		s2=str.charAt(i+1);
		if(s1==s2)
		{
			//ans=ans+s1;
			System.out.println("Duplicate character="+s1);
		}
	}
	System.out.println("character="+ans);
	}

}
