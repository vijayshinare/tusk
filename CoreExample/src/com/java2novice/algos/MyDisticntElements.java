package com.java2novice.algos;

public class MyDisticntElements {

	public static void main(String[] args) {
		int num[]= {1,2,4,56,7,8,9,4};
		MyDisticntElements.printDistinctElements(num);

	}

	public static void printDistinctElements(int[] num) {
		// TODO Auto-generated method stub
		for(int i=0;i<num.length;i++)
		{
			boolean isDistinct = false;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					 isDistinct = true;
					break;
				}
			}
			if(!isDistinct)
			{
				System.out.print(num[i]+ " ");
			}
		}
		
	}

}
