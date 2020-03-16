package com.Java_Basicprograms;

public class Pyramid_Pattern {

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
		
		System.out.println("############################");
		
		//Reverse Pyramid pattern
		for(int i=n; i>=1; i--)
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
		
		
	}

}
