package com.Strings_Concept;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		
		String str = "hyderabad";
		String str2 = "HYDERABAD";
		
		if(str.equalsIgnoreCase(str2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
