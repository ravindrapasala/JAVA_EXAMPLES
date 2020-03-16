package com.Abstract_Concept;

public class ChildClass extends TestClass {

	@Override
	void test1() {
		
		System.out.println("test1 method");
		
	}

	@Override
	void test2() {
		
		System.out.println("test2 method");
		
	}

	@Override
	void test3() {
		
		System.out.println("test3 method");
		
	}

	@Override
	void test4() {
		
		System.out.println("test4 methdo");
		
	}
	
	public static void main(String[] args) {
		
		TestClass tc = new ChildClass();
		tc.test1();
		tc.test2();
		tc.test3();
		tc.test4();
		tc.test5();
		
		TestClass.test6();
	}

}
