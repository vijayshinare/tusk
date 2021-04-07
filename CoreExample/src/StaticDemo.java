
public class StaticDemo {

	static
	{
		System.out.println("static block");
	}
	StaticDemo()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("annonymous block");
	}
	private void demo() {
		System.out.println("demo");
		
	}
		public static void main(String[] args) 
	{
		StaticDemo d=new StaticDemo();
		d.demo();

	}
		

}
