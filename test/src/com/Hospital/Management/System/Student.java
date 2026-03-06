package com.Hospital.Management.System;

public class Student {
private int rollNo;
private String name;
private Course course[]=new Course[3];



public Student(int rollNo, String name, Course[] course) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.course = course;
}


public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Course[] getCourse() {
	return course;
}
public void setCourse(Course[] course) {
	this.course = course;
}



public int getOverallAverage() {
	int average=0;
	int count=0;
	for(Course student: course) {
		for(int mark: student.getMarks()) {
			average+=mark;
			count++;
		}
	}
	return average/count;
}

public void displayStudentPerfomance() {
	System.out.println("");
	System.out.println("Student Name: "+this.name);
	for(Course co: course) {
	System.out.println("Course name : "+co.getCourseName()+"Course Average :"+co.marksAverage());
	}
	System.out.println("OverAll Average :"+getOverallAverage());
	
}




	public static void main(String[]args) {
		Course course[]= {
				new Course("Maths",new int[] {98,89,96} ),
				new Course("Physics",new int[] {89,99,91} ),
				new Course("Biology",new int[] {87,93,86} ),
		};
		Student student=new Student(101,"chaithanya",course);
		Course course1[]= {
				new Course("Maths",new int[] {88,89,86} ),
				new Course("Physics",new int[] {79,90,84} ),
				new Course("Biology",new int[] {97,93,82} ),
		};
		Student student1=new Student(102,"Vinodh",course1);
		
		
		
		
		student.displayStudentPerfomance();
		student1.displayStudentPerfomance();
	

}
}


