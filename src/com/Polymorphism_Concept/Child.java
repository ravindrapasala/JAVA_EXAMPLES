package com.Polymorphism_Concept;

public class Child extends Parent{
	
	public void app() //Overriding
	{
		System.out.println("Orange");
	}
	
	public void m1(int c, int d)
	{
		System.out.println(c*d);
	}

	
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.app();
		p.m1(10, 20);
		
		
		
		
	}
}
