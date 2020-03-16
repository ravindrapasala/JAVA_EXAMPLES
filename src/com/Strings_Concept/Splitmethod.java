package com.Strings_Concept;

public class Splitmethod 
{

	public static void main(String[] args) 
	
	{
		
		String str = "Hi,welcome@to$hyderabad";
		
		String[] arg = str.split("[@]");
		
		System.out.println(arg.length);
		
		for(int i=0; i<arg.length; i++)
		{
			System.out.println(arg[i]);
		}
    }
}
