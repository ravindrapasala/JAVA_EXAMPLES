package com.Strings_Concept;

public class StringBuff {

	public static void main(String[] args) {
		
		String str = "Welcome To Tamilnadu ";
		
		StringBuffer sb = new StringBuffer(str);
		
		//sb = sb.reverse();
		sb = sb.append("(Chennai Central Railway Station)");
		//sb = sb.deleteCharAt(0);
		//sb = sb.delete(0, 7);
		
		//sb = sb.insert(3, "-");
		//sb = sb.insert(8, "ravi", 0, 7);
		//sb = sb.replace(0, 1, "W");
		System.out.println(sb);

	}

}
