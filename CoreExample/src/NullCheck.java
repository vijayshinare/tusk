
public class NullCheck
{
public static void main(String args[])
{
	NullCheck n=new NullCheck();
	n.call(null);
}

private void call(Object i) {
	System.out.println("Obj="+i);
	
} 
private void call(int ij) {
	System.out.println("int="+ij);
	
}
private void call(String ij) {
	System.out.println("Str="+ij);
	
}


}
