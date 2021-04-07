import java.util.Scanner;


public class demo {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		int f,f1=0,f2=1,i=1;
		while(i<=n)
		{
			System.out.print(f2 +" ");
			f=f1;
			f1=f2;
			f2=f1+f2;
			i++;
		}
	}
}


