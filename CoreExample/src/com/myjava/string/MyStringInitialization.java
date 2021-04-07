package com.myjava.string;

public class MyStringInitialization {

	public static void main(String[] args) {
		String abc = "This is a string object";
        String bcd = new String("this is also string object"); 
        char[] c = {'a','b','c','d'};
        String cdf = new String(c);
        String junk = abc+" This is another String object";
        
        System.out.println(junk);
	}

}
