package com.codecrafter.practice;

import java.util.Scanner;

public class TestPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter One Number");
		int n=sc.nextInt();
		int count =0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println("Its a prime no");
		}
		else
		{
			System.out.println("Its not a prime no");
		}

	}

}
