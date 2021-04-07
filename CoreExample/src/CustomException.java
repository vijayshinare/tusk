
public class CustomException {

	public static void main(String[] args) {
		try
		{
			validate(9);
		}catch(Exception e)
		{
			System.out.println("Exception Occured :"+e);
		}
		System.out.println("rest of the code....");
		

	}

	static void validate(int age) throws InvalidAgeException 
	{
		if(age<18)
		{
			throw new InvalidAgeException("not valid");
			
		}
		else
			System.out.println("welcome to vote ");
	}
}

class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	}
