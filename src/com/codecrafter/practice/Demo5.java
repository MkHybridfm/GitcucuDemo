package com.codecrafter.practice;

public class Demo5 {

	public static void main(String[] args) {
		
		int []arr= {2,3,5,6,7,8,9};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of all the numbers is "+sum);
		
	}

}
