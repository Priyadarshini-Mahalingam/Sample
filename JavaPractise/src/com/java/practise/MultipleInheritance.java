package com.java.practise;

public class MultipleInheritance extends Sample{
	public void PrimeNo() {
		int num=7;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num/i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("The given No is Prime number");
		}else {
			System.out.println("The given No is Prime number");
		}
		
	}
	public static void main(String[] args) {
		MultipleInheritance mi=new MultipleInheritance();
		mi.data();
		mi.enhanched();
		mi.PrimeNo();
	}

}
