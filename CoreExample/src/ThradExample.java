
public class ThradExample extends Thread {
	 public void run(){ System.out.println("run");
	 
	 }


	public static void main(String[] args) throws InterruptedException {
		ThradExample t1=new ThradExample();  
		t1.start();
		Thread.sleep(1000);
		t1.wait();

	}

}
