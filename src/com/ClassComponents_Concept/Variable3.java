package com.ClassComponents_Concept;

public class Variable3 {
	
	 final int id = 80;

	public void display(int id)
	{
		id = id;
		System.out.println(id);
	}
	public void app()
	{
		System.out.println(id);
	}
	public static void main(String[] args) {
		
		Variable3 v = new Variable3();
		v.display(400);
		v.app();

	}

}
