
public class Pattern1 
{
	public static void main(String[] args) 
	{
		int size=3;
		
		for(int i=size;i>=-size;i--)
		{
			for(int j=size;j>=Math.abs(i);j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
