package com.java.practise;

public class MethodOverload {
public void student() {
		int physics=90;
		int chemistry=90;
		int biology=98;
		float cutoff=(biology/2)+(physics/4)+(chemistry/4);
		System.out.println("Student Biology cutoff mark is: "+cutoff);
	}
		
public void student(String name,int biology) {
	int maths=80;
	int physics=90;
	int chemistry=89;
	float agriCutoff=(maths/2)+(physics/2)+(chemistry/2)+(biology/2);
	System.out.println("Student " +name+ " Agri cutoff mark is: "+agriCutoff);
}

public void student(int maths,int physics,int chemistry) {
	float cutoff=(maths)+(physics/2)+(chemistry/2);
	System.out.println("Student Eng cutoff mark is: "+cutoff);
}
	
public static void main(String[] args) {
		
		MethodOverload mo=new MethodOverload();
		mo.student();
		mo.student("Priya",98);
		mo.student(90,90,90);
}
}