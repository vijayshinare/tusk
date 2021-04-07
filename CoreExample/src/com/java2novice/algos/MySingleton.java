package com.java2novice.algos;

public class MySingleton {
	private static MySingleton obj;
	
	static
	{
		obj=new MySingleton();	
	}
	private MySingleton()
	{
		
	}
	private static MySingleton getInstance()
	{
		return obj;
	}
	public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }

	public static void main(String[] args) {
		MySingleton ms= new MySingleton();
		ms.testMe();
		
		

	}

}
