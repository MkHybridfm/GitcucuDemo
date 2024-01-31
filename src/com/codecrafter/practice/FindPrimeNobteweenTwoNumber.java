package com.codecrafter.practice;

public class FindPrimeNobteweenTwoNumber {

	public static void main(String[] args) {
		
		int n1=1;
		int n2=23;
		
		for(int num=n1;num<=n2;num++)
		{
			int count =0;
			for(int i=2;i<num;i++) //if initialize i=1 means all numbers are divisible by 1 so count is 1 and our condition not satisfied(count==0),if in condition (i<=num) all numbers are divisible by self again our condition not satified(count==0) so it print nothing.  
			{
				if(num%i==0) 
				{
					count++;
					break;
				}
			}
			if (count==0 && num>1)
			{
				System.out.print(num+" ");
			}
		}

	}

}
