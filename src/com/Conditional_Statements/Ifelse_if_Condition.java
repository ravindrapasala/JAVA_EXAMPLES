package com.Conditional_Statements;

import java.util.Scanner;

public class Ifelse_if_Condition {

	public static void main(String[] args) {
		
		/*int a = 10;
		int b = 20;
		int c = 20;
		
		if(a>b && a>c)
		{
			System.out.println("a is bigger");
		}else if(b>a && b>c)
		{
			System.out.println("b is bigger");
			
		}else if(c>a && c>b)
		{
			System.out.println("c is bigger");
		}
		else
		{
			System.out.println("Any two values are same");
		}
*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		
		if(a == 1)
		{
			System.out.println("Grapes");
		}else if(a == 2)
		{
			System.out.println("Mango");
			
		}else if(a == 3)
		{
			System.out.println("Apple");
		}
		else if(a == 4)
		{
			System.out.println("Banana");
		}
		else if(a == 5)
		{
			System.out.println("Orange");
		}
		else
		{
			System.out.println("Invalid input.....please try again");
		}
		
		
		
	}

}
