
public class LargestElement_array {

	public static void main(String[] args) {
		int arr []=new int[]{1,3,4,7,9,2};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Largest Number "+max);

	}

}
