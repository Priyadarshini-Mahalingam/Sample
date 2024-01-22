package com.java.practise;

public class MethodOverriding {
	
public void method(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		MethodOverriding mo=new MethodOverriding();
		mo.method(10, 20);
	}

}
