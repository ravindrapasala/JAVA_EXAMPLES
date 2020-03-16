package com.ClassComponents_Concept;

public class Parameters {
	
	public void add(int a, int b) //Instance Method
	{
		System.out.println("Addition: "+(a+b));
	}
	
	public static void mul(int a, int b) //static method
	{
		System.out.println("Multiplication: "+(a*b));
	}

	public static void main(String[] args) {
		
		Parameters p = new Parameters();
		p.add(10, 20);
		
		mul(10, 10);
	}

}
