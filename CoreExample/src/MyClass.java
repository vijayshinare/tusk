public class MyClass  {
    
    public static void main(String[] args) throws InterruptedException {
           
           synchronized (args) {
                  System.out.print("1 ");
                  args.wait(100);
                  args.notify();
                  System.out.print("2 ");
          }
                        
    }
 
}