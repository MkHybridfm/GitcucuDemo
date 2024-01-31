package com.codecrafter.practice;

import java.util.Scanner;

public class EvenBetweenTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number");
		int n2=sc.nextInt();
		sc.close();
		
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
