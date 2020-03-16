package com.Java_Basicprograms;

public class Fibonacci_program {

	public static void main(String[] args) {
		
		int m1 = 0, m2 = 1, m3, i, n = 10;
		
		System.out.print(m1+" "+m2);
		
		for(i = 2; i<n; i++)
		{
			m3 = m1+m2;
			System.out.print(" "+m3);
			m1 = m2;
			m2 = m3;
		}

	}

}
