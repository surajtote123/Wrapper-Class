package com.wrapper;

public class Wrapper {
	
	public static void main(String[] args) {
		
		int a=10;
		
		Integer i=new Integer(a);
		
		System.out.println(i);
		
		int b=i.intValue();
		
		System.out.println(b);
	}

}
