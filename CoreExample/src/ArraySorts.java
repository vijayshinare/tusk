import java.util.Arrays;


public class ArraySorts {

	public static void main(String[] args) {
		int arr[]={1,5,7,19,9,20,15,3};
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		for (int i=0;i<arr.length;i++)
       System.out.println(arr[i]);
		//Arrays.sort(arr);
		//Arrays.toString(arr);
		//System.out.println(Arrays.toString(arr));

	}

}
