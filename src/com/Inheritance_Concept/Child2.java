package com.Inheritance_Concept;

public class Child2 extends Parent {
	
	public void Study()
	{
		System.out.println("Studying");
	}
	
	public static void main(String[] args) {
		
		Child2 c1 = new Child2();
		c1.Study();
		c1.Car();
		c1.House();
	}

}
