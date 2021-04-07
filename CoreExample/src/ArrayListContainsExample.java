import java.util.ArrayList;

public class ArrayListContainsExample {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(2);
		arr.add(6);
		arr.add(3);
		arr.add(6);
		arr.add(7);
		
		if(arr.contains(6))
		{
			System.out.println("6 was found in list");
		}
		else
			System.out.println("6 not found");
		

	}

}
