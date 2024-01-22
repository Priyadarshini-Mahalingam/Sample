package com.java.practise;

public class Sample extends Reverse1 {
  public void enhanched() {
	String arr[]=new String[5];
	arr[0]="Football";
	arr[1]="Cricket";
	arr[2]="Kabaddi";
	arr[3]="Gho-Gho";
	arr[4]="BasketBall";
	System.out.println("Interested games are: ");
	 for(String value : arr) {
		 System.out.println(value);
	 }
  }
}
