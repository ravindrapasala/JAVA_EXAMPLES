package com.ClassComponents_Concept;

public class Methodcalling {
	
	public void test1()
	{
		System.out.println("test1 method");
		
	}
	
	public void test2()
	{
		test1();
		System.out.println("test2 method");
		test3();
		test4();
	}
	
	public void test3()
	{
		System.out.println("test3 method");
		
	}
	
	public void test4()
	{
		System.out.println("test4 method");
	}

	public static void main(String[] args) {
		
		Methodcalling m = new Methodcalling();	
		m.test2();
				
		

	}

}
