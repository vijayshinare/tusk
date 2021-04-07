
public class charcount {

	public static void main(String[] args) {
		String str="i am vijay";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
		 if(str.charAt(i) != ' ')  
			count++;
		}
		System.out.println("total no of character in string="+count);

	}

}
