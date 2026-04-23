package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

	
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public static void main(String[]args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		
		boolean result=true;
		while(result) {
			System.out.println();
			System.out.println("1. Add Employee\r\n"
					+ "2. Display All Employees\r\n"
					+ "3. Find Highest Salary Employee\r\n"
					+ "4. Increase Salary by Percentage\r\n"
					+ "5. Exit");
			
			System.out.println("Select One Option: ");
			int option=sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			
			case 1:{
				System.out.println("Employee Id: ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Employee Name: ");
				String name=sc.nextLine();
				System.out.println("Employee Salary: ");
				double salary=sc.nextDouble();
				sc.nextLine();
				boolean idExist=false;
				for(Employee emp:list) {
					if(emp.id==id) {
						
						idExist=true;
						break;
						
					}
				}
				
				if(idExist) {
					System.out.println("Id is Already Exist!");
					break;
				}
				
				if(salary<0) {
					System.out.println("Inavlid Salary!");
					break;
				}
				
				list.add(new Employee(id,name,salary));
				System.out.println("Employee Added successfully..");
				break;
			}case 2:{
				if(list.size()==0) {
					System.out.println("There is no Employees in List!");
					break;
				}else {
				System.out.println("All the Employees:-");
				for(Employee emp:list) {
					System.out.println();
					System.out.println(emp.toString());
				}
				break;}
				
			}case 3:{
				if(list.size()==0) {
					System.out.println("There is Employee Data!!");
					break;
				}
				Employee e = null;
				double highestSal=0.0;
				for(Employee emp:list) {
					if(emp.salary>highestSal) {
						highestSal=emp.salary;
					}
					}
					for(Employee em:list) {
						if(em.salary==highestSal) {
							e=em;
						}
					}
					System.out.println("Employee with Highest Salary: "+e.toString());			
				break;
				
			}case 4:{
				
				System.out.println("Enter the percantage of Incremeant: ");
				int percantage=sc.nextInt();
				sc.nextLine();
				for(Employee emp:list) {
					emp.salary+=emp.salary*percantage/100;
				}
		        System.out.println("Incremented Salary's..");
				break;
				
			}case 5:{
				
				System.out.println("Exited...");
				result=false;
			}
			
			}
		}
		sc.close();
	}
}


