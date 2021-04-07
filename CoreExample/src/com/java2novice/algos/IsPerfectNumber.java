package com.java2novice.algos;

public class IsPerfectNumber {

	public static void main(String[] args) {
		IsPerfectNumber p=new IsPerfectNumber();
		System.out.println("Is perfect Number= "+p.perfect(28));

	}

	private boolean perfect(int no) {
		int temp=0;
		for(int i=1;i<=no/2;i++)
		{
			if(no % i==0)
			{
				temp=temp+i;
			}
		}
		if(temp==no)
		{
			System.out.println("Perfect Number");
		return true;
		}
		else
		{
			System.out.println("Not Perfect Number");
			return false;
		}
	}

}
