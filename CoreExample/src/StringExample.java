
public class StringExample {

	public static void main(String[] args) {
		String s=new String("Hello");
		String s1=new String("Hello");
		//StringBuffer s2="Hello";
		System.out.println(s==s1);
		//System.out.println(s==s2);
		System.out.println(s.equals(s1));

	}

}
