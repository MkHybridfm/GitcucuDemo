package com.codecrafter.practice;

public class MinimumNumber1 {

	public static void main(String[] args) {
		
		int []arr= {1,20,33,60,40,8};
		int min=arr[0];
		int secondmin=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				secondmin=min;
				min=arr[i];
			}
			else if(arr[i]<secondmin && arr[i]!=min)
			{
				secondmin=arr[i];
			}
		}
		System.out.println("The minimum number in the given array is: "+min);
		System.out.println("The second minimum number is: "+secondmin);
		

	}

}
