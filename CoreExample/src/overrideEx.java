
public class overrideEx {

	protected void method()throws ArithmeticException
	{
		System.out.println("Parent");
	}

}

 class subClass extends overrideEx{

	 protected void  method()throws ArithmeticException
	{
		System.out.println("Parent");
	}

}
