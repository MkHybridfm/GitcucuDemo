package com.codecrafter.practice;

import java.util.Scanner;

public class PrimeBetweenTwoNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		sc.close();
		
		
		for(int i=n1;i<=n2;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if (count==2)
			{
				System.out.print(i+" ");
			}
			
		}
	}

}
