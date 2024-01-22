package com.java.practise;
import java.util.*;
public class Reverse1 {
	public void data() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String value=sc.nextLine();
		System.out.println("Entered String is : "+value);
		char arr[]=value.toCharArray();
		System.out.println("Reversed String is: ");
		for(int i=value.length();i>0;i--) {
			  System.out.println(arr[i-1]);
		  }
	}
}
