
public class PalindromeNo {

	public static void main(String[] args) 
	{
	int n=153,r,sum=0;
	int temp=n;
	while(n>0)
	{
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
    if(sum==temp)
    {
    	System.out.println("arm");
    }
    else
    	System.out.println("not");
	
	}

}
