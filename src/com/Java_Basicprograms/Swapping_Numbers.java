package com.Java_Basicprograms;

public class Swapping_Numbers {

	public static void main(String[] args) {
		
		//Swapping numbers by using 3 variables
		int a = 10;
		int b = 20;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
		
		//Swapping numbers by using two variables
		int i = 100;
		int j = 200;
		
		i = i+j;
		j = i-j;
		i = i-j;
		
		System.out.println("i value is: "+i);
		System.out.println("j value is: "+j);
		
		
		

	}

}
