package com.java.practise;

public class StringExamples {

	public static void main(String[] args) {
		String s1="Java is platform independent";
		String s2="java is platform independent";
		char c=s1.charAt(3);
		System.out.println("The index of 3 is: "+c);

		boolean b=s1.equals(s2);
		System.out.println("s1 and s2 are not equal:"+b);

		boolean b1=s1.equalsIgnoreCase(s2);
		System.out.println("s1 and s2 are equal:"+b1);

		boolean b2=s1.contains("independent");
		System.out.println("The string contains the word: "+b2);
		
		String b3=s1.toLowerCase();
		System.out.println("String in Lowercase: "+b3);
		
		String b4=s1.toUpperCase();
		System.out.println("String in Uppercase: "+b4);
			}

		}

	