package com.Abstract_Concept;

public abstract class TestClass {
	
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
	
	public void test5()
	{
		System.out.println("normal method");
	}
	
	public static void test6()
	{
		System.out.println("static method");
	}
	
	TestClass()
	{
		System.out.println("Constructor");
	}

}
