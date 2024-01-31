package com.codecrafter.practice;

import java.util.Scanner;

public class EvenOddBetweenTwoNumber {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First No : ");
	int n1=sc.nextInt();
	System.out.println("Enter Second No : ");
	int n2=sc.nextInt();
	sc.close();
	
	System.out.println("Even numbers");
	for(int i=n1;i<=n2;i++)
	{
		if(i%2==0)
		{
			System.out.print(i+" ");
		}
		
	}
	System.out.println("\nOdd numbers");
	for(int i=n1;i<=n2;i++)
	{
		if(i%2!=0)
		{
			System.out.print(i+" ");
		}
		
	}
	
	
	
	}

}
