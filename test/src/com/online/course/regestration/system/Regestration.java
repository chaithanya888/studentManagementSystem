package com.online.course.regestration.system;
import java.util.Arrays;
import java.util.Scanner;

import java.util.function.*;


interface EligibilityChecker{
	boolean checkEligibility(double average);
}





class Student {
private int studentId;
private String studentName;
private int[] marks=new int[3];
public Student(int studentId, String studentName, int[] marks) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.marks = marks;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int[] getMarks() {
	return marks;
}
public void setMarks(int[] marks) {
	this.marks = marks;
}

public int caluclateTotal() {
	int total=0;
	for(int i=0;i<marks.length;i++) {
		total+=marks[i];
	}
	return total;
}

public double caluclateAverage() {
	double Average=0;
	Average=caluclateTotal()/marks.length;
	return Average;
}



public void displayStudentDetails(String grade,String result,String eligible) {
	System.out.println("Student Id: "+getStudentId());
	System.out.println("Student Name: "+getStudentName());
	System.out.println("Marks :"+Arrays.toString(getMarks()));
	System.out.println("Total :"+caluclateTotal());
	System.out.println("Average :"+caluclateAverage());
	System.out.println("Grade :"+grade);
	System.out.println("Result :"+result);
	System.out.println("Eligibilties :"+eligible);
	System.out.println("");
}



}






public class Regestration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student student[]=new Student[3];
		
		Predicate<Double> passcheck=avg->avg>=35;
		
		Function<Double,String> grade=g->{
			if(g>=75) 
				return "Grade A";
			else if(g>=60) 
				return "Grade B";
			else if(g>=50) 
				return "Grade C";
			else 
				return "Grade D";
			
		};
		
		EligibilityChecker eligible=e->{
			if(e>=40) 
				return true;
			else 
				return false;
			};
			
		Consumer<Student> obj= st->{
			
			String Result=passcheck.test(st.caluclateAverage())?"Pass":"Fail";   
			String Grade=grade.apply(st.caluclateAverage());
			String Eligible=eligible.checkEligibility(st.caluclateAverage())?"Eligible for certificate":"Not Eligible";
			st.displayStudentDetails(Grade,Result,Eligible);

		};

		
		
	    for(int i=0;i<student.length;i++) {
	    	System.out.println("");
		System.out.println("Student ID :");
		int studentId=sc.nextInt();
		sc.nextLine();
		System.out.println("Student Name :");
		String studentName=sc.nextLine();
		System.out.println("");
		int marks[]=new int[3];
		System.out.println("Marks");
		for(int j=0;j<marks.length;j++) {
			while(true) {
			try {
				System.out.println("Module"+(j+1)+" :");
				marks[j]=sc.nextInt();
				sc.nextLine();
				
				if(marks[j]<0 || marks[j]>100) {
					
				throw new IllegalArgumentException("Marks should be between 0 and 100");
				
				}
				break;
			}catch(IllegalArgumentException e) {
						System.err.println(e.getMessage());						
			}
				
			}
	    }
		student[i]=new Student(studentId,studentName,marks);
			}
		
		
	    for(Student s:student) {
	    	obj.accept(s);
			

	    }
		
		
		sc.close();
		
	}

}
