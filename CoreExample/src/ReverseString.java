import java.util.Scanner;


public class ReverseString {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1=sc.next();
		String s2="";
		int l=s1.length();
		for(int i=l-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		System.out.println("Reverse String is "+s2);

	}

	
		
}
