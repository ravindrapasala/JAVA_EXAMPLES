package com.Strings_Concept;

public class CharRelated {

	public static void main(String[] args) {
		
		
		String str = "test_123.232@gmail.com";
		
		char[] ch = str.toCharArray();
		
		for(char c : ch)
		{
			if(!Character.isLetterOrDigit(c))	
			{
				System.out.print(c);
			}
		}

	}

}
