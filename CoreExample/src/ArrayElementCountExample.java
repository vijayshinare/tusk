import java.util.Arrays;
import java.util.HashMap;

public class ArrayElementCountExample {

	public static void main(String[] args) {
		arrayElemntsCount(new int[] {4,5,4,5,6});
		

	}

	public static void arrayElemntsCount(int[] inputArray) {
		HashMap<Integer, Integer> elementCountMap=new HashMap<Integer, Integer>();
		
	for(int i:inputArray)
	{
		if(elementCountMap.containsKey(i))
		{
			elementCountMap.put(i, elementCountMap.get(i)+1);
		}
		else
			elementCountMap.put(i, 1);
	}
	System.out.println("InputArray:"+Arrays.toString(inputArray));
	System.out.println("Element Count:"+elementCountMap);
		
	}

}
