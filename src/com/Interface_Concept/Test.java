package com.Interface_Concept;

public class Test implements Interface3{

	@Override
	public void app() {
		
		System.out.println("app method");
	}

	@Override
	public void m1() {
		
		System.out.println("m1 method");
	}
	
	
	@Override
	public void click() {
		
		System.out.println("Click method");
		
	}
	
	@Override
	public void close() {
		
		System.out.println("close method");
		
	}
	
	public static void main(String[] args) {
		
		Interface3 i2 = new Test();
		i2.click();
		i2.app();
		i2.m1();
		i2.close();
		
		Interface1.m2();
		
	}

	

	
	
	

}
