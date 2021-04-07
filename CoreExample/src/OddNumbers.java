import java.util.Scanner;


public class OddNumbers {

	public static void main(String[] args) {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a");
    a=sc.nextInt();
    System.out.println("Enter b");
    b=sc.nextInt();
  //  int arr[]=new int[10];
    for(int i=a;i<b;i++)
    {
    	if(i%2!=0)
    	{
    		System.out.println(i+" ");
    	}
   
    }

	}

}
