
public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,8,5,9};
		
		for(int i=0;i<a.length;i++)
		{int temp=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
				
			
			
		}
		System.out.println(a[a.length-2]);
		

	}

}
