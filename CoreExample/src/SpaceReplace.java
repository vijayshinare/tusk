
public class SpaceReplace {

	public static void main(String[] args) {
		String str = "GeeksForGeeks abc"; 
		  
        // Creating array of string length 
        char[] ch = new char[str.length()];
        // Copy character by character into array 
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        } 
        for (char c : ch) { 
            System.out.print(c); 
        } 
	    
	}
	

}
