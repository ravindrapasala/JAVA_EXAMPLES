package com.Conditional_Statements;

import java.util.Scanner;

public class Switch_Condition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		String s = sc.next();
		s = s.toLowerCase();
		
		switch (s) {
		case "firefox":
			System.out.println("Mounika");
			break;
		case "chrome":
			System.out.println("Manvitha");
			break;
		case "ie":
			System.out.println("Krishna");
			break;
		case "opera":
			System.out.println("Mani");
			break;
		case "safari":
			System.out.println("Rahul");
			break;

		default:
			System.out.println("Invalid data, so please try again.......");
			
		}

	}

}
