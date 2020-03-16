package com.Strings_Concept;

public class IndexOf {

	public static void main(String[] args) {
		
		String str = "my transaction id (111111) is generated";
		
		/*
		 * don't use looping statements
		 * don't use any character related methods  
		 */
		
		int post = str.indexOf("(")+1;
		
		int post1 = str.indexOf(")");
		
		System.out.println(str.substring(post, post1));

	}

}
