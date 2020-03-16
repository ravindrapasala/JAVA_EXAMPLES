package com.Java_Basicprograms;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n = 1234;
		int reverse = 0;
		
		while(n!=0)
		{
			int d = n%10;
			reverse = reverse*10+d;
			n=n/10;
		}
		System.out.println(reverse);

	}

}
