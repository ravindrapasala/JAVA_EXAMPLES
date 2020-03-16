package com.Constructor_Concept;

public class Test2 {
	
	public Test2() //Default constructor 
	{
		System.out.println("Default cobstructor");
	}
	
	public Test2(int a) //parameterized constructor
	{
		this();
		System.out.println("parameterized constructor: "+a);
	}
	
	public Test2(String s)
	{
		this(10);
		System.out.println(s);
	}
	
	public void m1()
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		
		Test2 t = new Test2("aaa");
		t.m1();

	}

}
