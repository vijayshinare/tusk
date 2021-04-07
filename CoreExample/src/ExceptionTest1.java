
public class ExceptionTest1 {

	public static void main(String[] args) {
		try{
            int i=10/0;  
     }catch(ArithmeticException ae){
         System.out.println("Exception handled - ArithmeticException");
  }  
		catch(Exception e){
            System.out.println("Exception handled - RuntimeException");
     } 

}
}
