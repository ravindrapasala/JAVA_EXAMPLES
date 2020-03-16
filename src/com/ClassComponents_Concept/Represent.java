package com.ClassComponents_Concept;

public class Represent {
	
	int a =10;
	int b = 20;
	
	public void app()
	{
		int a = 1; 
		int b = 2;
		
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}

	public static void main(String[] args) {
		
		Represent r = new Represent();
		r.app();
		
		

	}

}
