package com.Java_Basicprograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();*/
		
		for(int num=1; num<=50; num++)
		{
			int counter = 0;
			for(int i=2; i<=num/2; i++)
			{
				if(num % i ==0)
				{
					counter = counter+1;
				}
			}
			if(counter==0)
			{
				System.out.println(num+" is prime number");
			}
			else
			{
				System.out.println(num+" is not prime number");
			}
		}

	}

}
