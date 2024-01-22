package com.java.practise;
public class StringMethods1 {
	public static void main(String[] args) {
		String s1="Spring Boot Concepts";
		String s2="";
		
		int length=s1.length();
		System.out.println("The length of 1st string is "+length);
		
		int index=s1.indexOf('g');
		System.out.println("The Index of g is "+index);
		
		int LastIndex=s1.lastIndexOf('o');
		System.out.println("The Last index of o is "+LastIndex);
		
		boolean startswith=s1.startsWith("Spring");
		System.out.println("The String s1 contains the word Spring: " +startswith); 
		
		boolean endswith=s1.endsWith("training");
		System.out.println("The String s1 does not contains the word training: " +endswith); 
		
		boolean empty=s2.isEmpty();
		System.out.println("The string s2 is empty: "+empty);
	}

}
