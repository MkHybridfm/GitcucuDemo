package com.codecrafter.practice;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		
		int [] arr= new int[size];
		System.out.println("Enter "+size+" Elements of an array ");
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Element of index "+i+":");
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("The array elements are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}

}
