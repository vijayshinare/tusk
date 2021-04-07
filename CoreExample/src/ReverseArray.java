
public class ReverseArray {

	public static void main(String[] args) {
	int arr []=new int[]{1,3,4,7,9,2};
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]);
	}
System.out.println("\n Reverse Order");
for(int j=arr.length-1;j>=0;j--)
{
	System.out.print(arr[j]+ " ");
}
	}

}
