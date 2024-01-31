package com.codecrafter.practice;

public class ReverseArray {

	public static void main(String[] args) {
		
		int []arr= {5,6,7,8,9,2};
		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		
		System.out.print("The reverse order of the array is: ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
