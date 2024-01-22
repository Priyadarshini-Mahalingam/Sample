package com.java.practise;
import java.util.*;
public class ArmstrongNo{

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no to find armstrong");
int num=sc.nextInt();
int arm=0;
int num1=num;
while(num>0) {
int rem=num%10;//153%10=3  15%10=5    1%10=1
arm=arm+(rem*rem*rem);//27 27+125=152 152+1=153
num =num/10;//153/10=15    1          1/10=0
}
if(num1==arm) {
	System.out.println("The given no is armstrong");
}else {
	System.out.println("The given no is not an armstrong");
}
	}
}


/*number whose sum of each digit raised to the power of total number of digits is equal to the 
given number itself.
eg:153--3
(1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153(armstrong)

eg:1234--4
(1*1*1*1)+(2*2*2*2)+(3*3*3*3)+(4*4*4*4)=1+16+81+256=354(not an armstrong)*/
