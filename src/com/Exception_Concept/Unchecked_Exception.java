package com.Exception_Concept;

public class Unchecked_Exception {

	public static void main(String[] args) {
		
		try {
			
			int[] a  =  new int[3];
			a[0] = 10;
			a[1] = 100;
			a[2] = 1000;
			a[3] = 99;
			System.out.println(a[3]);
		}
		catch(Exception ne)
		{
			System.out.println(ne.getMessage());
			ne.printStackTrace();
			
		}

	}

}
