
public class DuplicateString
{	
	public static void main(String[] args) 
	{
		String s1="jaaaaaaavaaaaaaa";
		s1=s1+" ";
		char ch1,ch2;
		String ans="";
		for(int i=0;i<s1.length()-1;i++)
		{
			ch1=s1.charAt(i);
			ch2=s1.charAt(i+1);
		if(ch1!=ch2)
		{
			ans=ans+ch1;
		}
	}
		System.out.println("ans="+ans);

}
}
