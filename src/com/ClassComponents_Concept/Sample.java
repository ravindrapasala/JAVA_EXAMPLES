package com.ClassComponents_Concept;

public class Sample {
	static String str1 = "Welcome"; //static variables
	static String str2 = "to Java";
	
	int a = 10; //instance variable
	
	
	public void m1() //Instance method or Non-static
	{
		int b =5; //local variable
		System.out.println("Instance: "+(str1+str2));
		System.out.println(a+b);
	}
	
	public static void m2()//Static method
	{
		
		System.out.println("Static: "+(str1+str2));
		
	}
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.m1();
		m2();

	}


}
