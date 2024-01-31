package com.codecrafter.practice;

public class MinimunAndMaximumElementinArray {

	public static void main(String[] args) {
		
		int [] arr= {4,5,7,8,9,};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The maximum number of the array element is: "+max);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("The minimum number of the array element is: "+min);

	}

}
