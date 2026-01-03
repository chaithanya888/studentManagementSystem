package com.college.app;
import java.util.Scanner;
import com.college.model.*;
import com.college.service.StudentService;
public class MainApp {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		
		System.out.println("Enter Student Name: ");
		String name=scanner.nextLine();
		System.out.println("Enter Age: ");
		int age=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Contact Number: " );
		long contactNumber=scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter StudentId: ");
		int studentId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Department: ");
		String department=scanner.nextLine();
		System.out.println("Enter Course Name: ");
		String coursename=scanner.nextLine();
		System.out.println("Enter Course Fee: ");
		double courseFee=scanner.nextDouble();
		
		


		Student obj2=new Student( name, age,contactNumber,studentId,department,coursename);
		StudentService obj3=new StudentService();
	
		
		 System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
		System.out.println(obj2.getContactNumber());
		obj2.studentDetails();
		obj3.calculateDiscountedFee(department, courseFee);
		scanner.close();
	}
}
