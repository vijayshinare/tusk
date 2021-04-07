
public class ThreadClass{

	public static void main(String[] args) 
	{
		demo d=new demo();
		demo d2=new demo();
	
		//d.stop();
		d.start();
		//d.stop();
		d.start();

	}
}

	
	class demo extends Thread
	{
	public void run()
	{
		System.out.println("a");
	}

}
