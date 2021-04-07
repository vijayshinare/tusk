
public class Fibbonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=8;
		int f1,f2=0,f3=1;
		for(int i=1;i<n;i++)
		{
			f1=f2;
			f2=f3;
			f3=f1+f2;
			System.out.println(" "+f3);
		}
		

	}

}
