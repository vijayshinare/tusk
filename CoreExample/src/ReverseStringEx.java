import java.util.Scanner;


public class ReverseStringEx {
	public static void main(String[] args) 
	{
		ReverseStringEx rv=new ReverseStringEx();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String st=sc.next();
	System.out.println(st);
	String rvs=rv.reversest(st);
	System.out.println("Reverse String "+rvs);
	
	}
	String reversest(String s)
	{
char ch[]=s.toCharArray();
int l=ch.length;
for(int i=l-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
return s;
	}
	

	}


