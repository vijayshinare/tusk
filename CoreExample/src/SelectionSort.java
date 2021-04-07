
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a[]={10,1,2,32,19,9};
		//int swap
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
				
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		}
	}


