
public class TryCatchExample2 {

	public static void main(String[] args) {  
        try  
        {  
        int data=0/1;
        //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println("Arithmetic");  
        }
        catch(Exception e)  
        {  
            System.out.println("Exception");  
        }
        System.out.println("rest of the code");  
    }  
      

}
