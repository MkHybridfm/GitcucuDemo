package com.codecrafter.practice;

import java.util.Scanner;

public class TestPrime2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int n2=sc.nextInt();
		sc.close();
		
		for(int i=n1;i<=n2;i++)
		{	
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && i>1)
			{
				System.out.println(i+" ");
			}
		}

	}

}
