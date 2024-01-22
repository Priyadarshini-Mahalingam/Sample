package com.java.practise;

public class MethodOverriding1 extends MethodOverriding{

	public void method(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		MethodOverriding1 mo1=new MethodOverriding1();
		mo1.method(30, 20);
	}

}
