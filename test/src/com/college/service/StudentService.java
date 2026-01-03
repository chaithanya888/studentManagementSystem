package com.college.service;

public class StudentService {
	
	    double totalFee = 0;

	    public void calculateDiscountedFee(String department, double fee) {
	        if("IT".equalsIgnoreCase(department.trim())) {
	            double discountPercent = fee * 10 / 100;
	            totalFee = fee - discountPercent;
	            System.out.println("Original fee: " + fee);
	            System.out.println("Discount applied: 10%");
	            System.out.println("Total fee: " + totalFee);
	        } else {
	            System.out.println("No discount");
	            System.out.println("Original fee: " + fee);
	        }
	    }
	}

