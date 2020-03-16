package com.ClassComponents_Concept;

public class Represent3 {

	static int c =100;
	static int d =200;
	public void app(int c, int d)
	{
		System.out.println(c+d);
	}
	
	public void m1(int c, int d)
	{
	System.out.println(c+d);
	}
	
	public static void main(String[] args) {
		
		Represent3 r = new Represent3();
		r.app(10, 20);
		r.m1(c, d);

	}

}
