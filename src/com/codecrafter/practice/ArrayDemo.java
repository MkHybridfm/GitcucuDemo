package com.codecrafter.practice;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int [] arr= {9,12,4,5,7,8};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Ascending order array elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
	}

}
