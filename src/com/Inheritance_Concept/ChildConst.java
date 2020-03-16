package com.Inheritance_Concept;

public class ChildConst extends ParentConst{
	
	
	ChildConst()
	{
		super(10);
		System.out.println("Child Const");
	}
	

	public static void main(String[] args) {
		 
		ChildConst c = new ChildConst();
	}
}
