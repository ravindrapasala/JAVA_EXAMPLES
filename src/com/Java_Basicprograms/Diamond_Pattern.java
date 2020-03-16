package com.Java_Basicprograms;

public class Diamond_Pattern {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=(i*2)-1; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1; i>=1; i--)
		{
			
			for(int j=n-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=(i*2)-1; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
