public class SuperClass{
    void method() throws NullPointerException{
           System.out.println("superClass method");
    }
}
 
class SubClass extends SuperClass{
    void method(){
           System.out.println("SubClass method");
    }
//}
 
 

//public class ExceptionTest11 {
    public static void main(String[] args) {
           SuperClass obj=new SubClass();
           obj.method();
    }
}