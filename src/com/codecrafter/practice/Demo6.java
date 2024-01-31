package com.codecrafter.practice;

public class Demo6 {

	public static void main(String[] args) {

		int []arr= {5,6,7,8,9,1};
		int sum =0;
		int substraction=0;
		int mul=1;
		
		for(int i=0;i<arr.length;i++)
		{
			sum =sum+arr[i];
		}
		System.out.println("The sum of the array is: "+sum);
			
		for(int i=0;i<arr.length;i++)
		{
			substraction = substraction-arr[i];
		}
		System.out.println("The substraction of the array is: "+substraction);
		
		for(int i=0;i<arr.length;i++)
		{
			mul=mul*arr[i];
		}
		System.out.println("The multiplication of the array is: "+mul);
	}

}
