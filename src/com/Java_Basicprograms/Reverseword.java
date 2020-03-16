package com.Java_Basicprograms;

public class Reverseword {

	public static void main(String[] args) {
		
		String str = "Welcome to the infotech pvt ltd";
		String result = "";
		
		String[] arg = str.split(" ");
		for(String s : arg)
		{
			StringBuffer sb = new StringBuffer(s);
			result = result+sb.reverse().toString()+" ";
		}
		
		System.out.println(result);
	}

}
