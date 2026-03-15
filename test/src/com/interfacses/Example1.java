package com.interfacses;
import java.util.function.*;

public class Example1 {

	private String empName;
	private String empDesg;
	private double empSalary;

	public Example1(String empName, String empDesg, double empSalary) {
		super();
		this.empName = empName;
		this.empDesg = empDesg;
		this.empSalary = empSalary;
	}

	
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpDesg() {
		return empDesg;
	}


	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "Example1 [empName=" + empName + ", empDesg=" + empDesg + ", empSalary=" + empSalary + "]";
	}


	public static void main(String[] args) {
		Predicate<Example1> employee=new Predicate<Example1>(){
			public boolean test(Example1 emp) {
				if(emp.empSalary>10000) {
				 return true;
				}else {
					return false;
				}
			}
		};
		
		Consumer<Example1> consumer=new Consumer<Example1>() {
			
			public void accept(Example1 employee1) {
				if(employee.test(employee1)) {
					double discount=(employee1.getEmpSalary())+(employee1.getEmpSalary()*10/100);
					employee1.setEmpSalary(discount);
					
				}
				System.out.println(employee1);
			}
			
		};
		
		
		Example1 employ1=new Example1("Raju","Sf",20000.0);
		Example1 employ2=new Example1("Vinay","Sf",2000.0);
		Example1 employ3=new Example1("Chaithanya","Sf",40000.0);
		
		Example1 [] arr= {employ1,employ2,employ3};
		for(Example1 ele:arr) {
			consumer.accept(ele);
		}

	}

}
