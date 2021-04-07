import java.io.IOException;


public class ExceptionTest {

	 void method(Exception e){
         System.out.println(e+" caught in Exception method");
  }
  void method(ArithmeticException ae){
         System.out.println(ae+" caught in ArithmeticException method");
  }
  
  public static void main(String[] args) {
         ExceptionTest obj=new ExceptionTest();
        // obj.method();
        // obj.method(new ArithmeticException());
         obj.method(new IOException());
  }
}
