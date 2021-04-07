import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Apple");
		ar.add("Banana");
		ar.add("mango");
		ar.add("Grapes");
		
	/*	String[] array=new String[ar.size()];
		for(int i=0;i<ar.size();i++)
		{
			array[i]=ar.get(i);
		}
		for(String k:array)
		{
			System.out.println(k);
		}*/
		
		
		String[] arr=ar.toArray(new String[ar.size()]);
		
		for(String l:arr)
		{
			System.out.println(l);
		}
	}

}
