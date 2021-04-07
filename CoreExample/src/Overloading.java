
public class Overloading {
	static int add(int a,int b){return a+b;}  
	static double add(double a,double b){return a+b;} 
	
	
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.add(5,6);

	}

}
