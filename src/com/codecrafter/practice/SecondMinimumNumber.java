package com.codecrafter.practice;
public class SecondMinimumNumber {

	public static void main(String[] args) {
		
		int []arr= {10,20,33,60,40};
		int minimum=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<minimum)
			{
				minimum=arr[i];
			}
		}
		System.out.println("The minimum number in the given array is: "+minimum);
		

	}

}
