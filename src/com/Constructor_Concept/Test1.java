package com.Constructor_Concept;

public class Test1 {
	
	public Test1() //Default constructor 
	{
		System.out.println("Default cobstructor");
	}
	public Test1(int a) //parameterized constructor
	{
		System.out.println("parameterized constructor: "+a);
	}
	public Test1(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		Test1 t1 = new Test1(10);
		Test1 t2 = new Test1("aaa");
		System.out.println(t +""+t1+""+t2);
}
}
