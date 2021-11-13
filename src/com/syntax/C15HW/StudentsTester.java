package com.syntax.C15HW;

public class StudentsTester {

	public static void main(String[] args) {
		
		Students s1=new Students();
		s1.studName="Nabil";
		s1.studID=123;
		System.out.println("Student name is: "+s1.studName);
		System.out.println("Student ID# is:"+s1.studID);
		System.out.println("The number of students: "+Students.numOfStud++);
		
		
		Students s2=new Students();
		s2.studName="Ramin";
		s2.studID=125;
		System.out.println("Student name is: "+s2.studName);
		System.out.println("Student ID# is:"+s2.studID);
		System.out.println("The number of students: "+Students.numOfStud++);
		
		Students s3=new Students();
		s3.studName="Aysha";
		s3.studID=127;
		System.out.println("Student name is: "+s3.studName);
		System.out.println("Student ID# is:"+s3.studID);
		System.out.println("The number of students: "+Students.numOfStud++);
		
		
		
	}

}
