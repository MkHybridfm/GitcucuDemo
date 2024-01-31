package com.dataflex.practice;

public class SecondLargest {
	
	

	public static void main(String[] args) {
		
		int[] arr= {15,16,78,34,90,1,5,80};
		int largest=0;
		int secondlargest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest=arr[i];
			}
			
			if(arr[i]>secondlargest && arr[i]!=largest)
			{
				secondlargest=arr[i];
			}
		}
		System.out.println("The second largest number is: "+secondlargest);

	}

}
