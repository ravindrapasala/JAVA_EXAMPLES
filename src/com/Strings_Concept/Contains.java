package com.Strings_Concept;

public class Contains {

	public static void main(String[] args) {
		
		String str = "Hyderabad";
		String str2 = "bad";
		
		System.out.println(str.contains(str2));
		
		if(str.contains(str2))
		{
			System.out.println("Existing");
		}
		else
		{
			System.out.println("Not Existing");
		}

	}

}
