package com.Array_Concept;

public class Twodimensional {

	public static void main(String[] args) {
		
		int[][] a = new int[3][3];
		a[0][0] = 1;
		a[0][1] = 1;
		a[0][2] = 1;
		
		a[1][0] = 2;
		a[1][1] = 2;
		a[1][2] = 2;
		
		a[2][0] = 3;
		a[2][1] = 3;
		a[2][2] = 3;
		
		System.out.println(a[1][2]);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		

	}

}
