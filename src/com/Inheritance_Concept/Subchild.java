package com.Inheritance_Concept;

public class Subchild extends Child{
	
	public void play()
	{
		System.out.println("playing");
		super.Job();
		super.Car();
		super.House();
	}
	
	public static void main(String[] args) {
		
		Subchild s = new Subchild();
		s.play();
			
		
	}

}
