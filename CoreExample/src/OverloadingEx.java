
//public class OverloadingEx {

	class Vehicle{  
		  //defining a method  
		  void run(int x){System.out.println("Vehicle is running");}  
		}  
		//Creating a child class  
		class OverloadingEx extends Vehicle{  
		  //defining the same method as in the parent class  
		  void run(int x){System.out.println("Bike is running safely");}  
		  
		  public static void main(String args[]){  
			  OverloadingEx obj = new OverloadingEx();//creating object  
		  obj.run(5);//calling method  
		  
		  }  
		}  
//}
