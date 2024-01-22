package com.java.practise;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");//priya
		String word=sc.nextLine();
		char arr[]=word.toCharArray();
		for(int i=arr.length;i>0;i--) {
			System.out.print(arr[i-1]);
		}

	}
	
}
        /* initialize ArrayList  
        ArrayList<Integer> al = new ArrayList<Integer>();
        // add elements to ArrayList object
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        System.out.println("Using Advanced For Loop");   
        // printing ArrayList 
        for (Integer num : al) {         
            System.out.print(num);   
        }*/
  