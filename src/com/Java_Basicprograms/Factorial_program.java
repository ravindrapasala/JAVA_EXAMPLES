package com.Java_Basicprograms;

public class Factorial_program {

	public static void main(String[] args) {
		
		int n = 5;
		int fact = 1;
		
		for(int i = 1; i<=n; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);

	}

}
