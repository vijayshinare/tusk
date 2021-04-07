package com.java2novice.algos;

public class NumberReverse {

	public static void main(String[] args) {
		NumberReverse nr=new NumberReverse();
		System.out.println("Result: " +nr.reverseNum(12345));

	}

	public int reverseNum(int num)
	{
		int sum=0;
		int r; 
		while(num !=0)
		{
			r=num % 10;
			sum=(sum*10) + r;
			num=num/10;
		}
		return sum;
	}

}
