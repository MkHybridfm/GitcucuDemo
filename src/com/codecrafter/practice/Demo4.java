package com.codecrafter.practice;

public class Demo4 {

	public static void main(String[] args) {
		
		int [] arr= {5,6,7,45,67,50};
		
		int largest=arr[0];
		int secondlargest=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest=arr[i];
			}
			
			else if(arr[i]>secondlargest && arr[i]!=largest)
			{
				secondlargest=arr[i];
			}
		}
		System.out.println("The second largest number is: "+secondlargest);

	}

}
