import java.util.Scanner;


public class BubbleSort {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();	
		/*int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}*/
		int arr[]={1,3,2,6};
		for(int i=0;i<n;i++)
		{
		System.out.println("Array "+arr[i]);
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=1;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
				}
			}
			
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
