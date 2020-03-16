package com.Strings_Concept;

public class String_Ex {

	public static void main(String[] args) {
		
		String s="TestcaseId TestcaseSteps TestA/P TestE/p TestComments";
		
		String[] arr=s.split("\\s");
		int count=0;
		for(String s1:arr)
		{
			if(s1.contains("Test"))
			{
				String s2=s1+" contains Test";
				System.out.println(s2);
				count++;
			}	
		}
       System.out.println(count);
	}

}
