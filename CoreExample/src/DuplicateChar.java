
public class DuplicateChar {

	public static void main(String[] args) {
		String str="w3schoowls";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[j]+" ");
					//break;
					ch[j]=0;
				}
			}
		
		}
	}

}
