package com.codecrafter.practice;

public class TryCatchwithDifferentTypeOfException {

	public static void main(String[] args) {
		
		try {
			
			int a=200/0;
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e)  // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException 
		{
			System.out.println(e);
		}

	}

}
