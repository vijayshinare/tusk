import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	static void go() throws RuntimeException
	{
		try
		{
			System.out.println("start");
			throw new RuntimeException();
		}catch(Exception ex)
		{
			System.out.println("Exception");
		}
	}
	public static void main(String[] args) {
		try{
			go();
		}catch(RuntimeException ex)
		{
			System.out.println("Run Exception");
		}	System.out.println("end");
	
	}
	

}
