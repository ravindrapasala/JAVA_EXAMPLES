package com.Java_Basicprograms;

public class FetchNumerics {

	public static void main(String[] args) {
		
		String str = "my transaction id 1111 is generated";
		
		String temp = "";
		
		char[] ch = str.toCharArray();
		for(Character c : ch )
		{
			if((int)c >= (int)'0' && (int)c <= (int)'9')
			{
				temp = temp+c;
			}
		}
		
		System.out.println(temp);
	}
}
