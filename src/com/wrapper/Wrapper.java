package com.wrapper;

public class Wrapper {
	
	public static void main(String[] args) {
		
		int a=10;
		
		Integer i=new Integer(a);
		
		System.out.println(i);
		
		int b=i.intValue();
		
		System.out.println(b);
		
		float f=20.5f;
		
		Float ft=new Float(f);
		
		System.out.println(ft);
	}

}
