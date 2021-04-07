import java.util.ArrayList;

public class ArrayListLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(11);
		al.add(16);
		al.add(10);
		al.add(null);
		al.add(null);
		al.add(9);
		System.out.println("using advance for loop");
		for(Integer i:al)
		{
			System.out.println(i);
		}
	}

}
