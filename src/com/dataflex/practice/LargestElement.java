package com.dataflex.practice;

public class LargestElement {

	public static void main(String[] args) {
		
		int [] arr= {73,23,4,5,778,2121,8709};
		int largest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);

	}

}
