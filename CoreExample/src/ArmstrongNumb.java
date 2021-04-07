import java.util.Scanner;


public class ArmstrongNumb {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	int temp=n;
	int sum=0;

	while(n!=0)
	{
		int r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
	
	if(temp==sum)
	{
		System.out.println("armstrong ");
	}
	else
		System.out.println("Not");
	}

}
