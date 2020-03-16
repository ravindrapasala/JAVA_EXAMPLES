package com.ClassComponents_Concept;

public class Represent2 {
	
	int a; //instance variables
	int b;
	public void app(int a, int b) //instance method with local variables
	{
		this.a=a;
		this.b=b;
		System.out.println("app method: "+(a+b));
	}
	
	public void m1()
	{
		System.out.println("m1 method: "+(a+b));
	}

	public static void main(String[] args) {
		
		Represent2 r = new Represent2();
		r.app(10, 20);
		r.m1();

	}

}
