package com.Abstract_Concept;

public class Sample3 extends Sample2 {

	@Override
	void m6() {
		
		System.out.println("m6 method");
	}

	@Override
	void m7() {
		
		System.out.println("m7 method");
		
	}

	@Override
	void m8() {
		
		System.out.println("m8 method");
	}
	
	public static void main(String[] args) {
		
		Sample1 s = new Sample3();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		s.m5();
		s.m6();
		s.m7();
		s.m8();
		
	}

}
