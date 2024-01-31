package com.dataflex.practice;

public class ArrayAddition {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,4,6,7,8,9,8};
		int sum=0;
		int sub=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of the all array elements is: "+sum);
		
		for(int i=0;i<arr.length;i++)
		{
			sub=sub-arr[i];
			//System.out.println("sub of the all array elements is: "+sub);
		}
		System.out.println("sub of the all array elements is: "+sub);
	}

}
