package java8.examples;
@Functionalinterface
interface FunctionalInter
{
	public int multiply(int a,int b);
}

public class FunctionalInterface {

	public static void main(String[] args) {
		FunctionalInter total=(a,b)->a*b;
		System.out.println("Result"+total.multiply(30,60));

	}

}
