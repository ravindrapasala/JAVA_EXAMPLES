package com.Java_Basicprograms;

public class Swapping_Strings {

	public static void main(String[] args) {
		
		
		String str1 = "Hi ";
		String str2 = "Ravi";
		
		str1 = str1+str2;
		
		//System.out.println(str1+" length is "+str1.length());
		//int a = str1.length()-str2.length();
		//System.out.println(a);
		
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		
		System.out.println("str1 value is: "+str1);
		System.out.println("str2 value is: "+str2);
		

	}

}
