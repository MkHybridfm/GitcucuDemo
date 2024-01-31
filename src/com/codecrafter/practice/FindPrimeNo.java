package com.codecrafter.practice;
import java.util.Scanner;

public class FindPrimeNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number");
		int n = sc.nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+" is prime number");
		}
		else
			System.out.println(n+" is not a prime number");
		
		sc.close();

	}

}
