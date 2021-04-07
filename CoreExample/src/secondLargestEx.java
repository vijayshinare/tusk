
public class secondLargestEx {

	public static void main(String[] args) {
		int a[]={47498, 14526, 74562, 42681, 75283, 45796};
		System.out.println("Second largest=" +secondLargest(a));
    System.out.println();
	}
	
	static int secondLargest(int[] a)
	{
	/*	int max=input[0];
		
		for(int i=0;i<input.length;i++)
		{
			if(input[i]>max)
				max=input[i];
		}
		System.out.println("Largest Element"+max);*/
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-2]);
		return a[a.length-2];
		// return a[a.length-3];
	}
	
}
