import java.util.Scanner;


public class RevNo {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		int r;
		int sum=0;
		
		while(n!=0)
		{
			r=n%10;
		 sum=sum*10+r;
			n=n/10;
		}
		System.out.println("Rev no"+sum);
		
		
		
	}


}
