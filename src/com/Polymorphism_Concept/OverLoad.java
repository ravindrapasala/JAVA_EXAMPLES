package com.Polymorphism_Concept;

public class OverLoad {
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m1(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void m1(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		OverLoad l = new OverLoad();
		l.m1(10, 20);
		l.m1();
		l.m1("Pavani");
	}

}
