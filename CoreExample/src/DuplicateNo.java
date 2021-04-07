import java.util.ArrayList;
import java.util.List;

public class DuplicateNo 
{
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			list.add(i);
		}
		list.add(3);
		list.add(6);
System.out.println(list);
for(int i=0;i<10;i++)
{
if(list.contains(i))
	System.out.print(i+ " ");

else
{
	list.add(i);
System.out.println("Duplicates"+i);
}
	}
	}

}
