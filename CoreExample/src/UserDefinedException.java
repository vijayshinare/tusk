
 class UserDefinedExceptionex extends RuntimeException
{
	 UserDefinedExceptionex(String s)
	 {
		 super(s);
	 }
}
public class UserDefinedException {
	public static void main(String str[])
	{
		int i=1;
		if(i==1)
			throw new UserDefinedExceptionex("User Defined Exception");
	}
}


